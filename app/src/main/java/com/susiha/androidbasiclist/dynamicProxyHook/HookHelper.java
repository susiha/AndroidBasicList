package com.susiha.androidbasiclist.dynamicProxyHook;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.view.View;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

/**
 * author:  sunshihai
 * createTime:  2018/8/14
 * desc:
 */

public class HookHelper {


    public static  void hookViewClick(View view) throws Exception{

        Class<?> viewClass = Class.forName("android.view.View");

        Method linstenerInfoMethod = viewClass.getDeclaredMethod("getListenerInfo");

        linstenerInfoMethod.setAccessible(true);

        Object linstenerInfoObject = linstenerInfoMethod.invoke(view);





        Class<?> adapterClass = Class.forName("com.susiha.adapter.ActivityAdapter");

        Constructor adapterConstructor = adapterClass.getConstructor(ArrayList.class, Context.class);

    }




    public static void attachContext() throws Exception{
        // 先获取到当前的ActivityThread对象
        Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
        Method currentActivityThreadMethod = activityThreadClass.getDeclaredMethod("currentActivityThread");
        currentActivityThreadMethod.setAccessible(true);
        //currentActivityThread是一个static函数所以可以直接invoke，不需要带实例参数
        Object currentActivityThread = currentActivityThreadMethod.invoke(null);

        // 拿到原始的 mInstrumentation字段
        Field mInstrumentationField = activityThreadClass.getDeclaredField("mInstrumentation");
        mInstrumentationField.setAccessible(true);
        Instrumentation mInstrumentation = (Instrumentation) mInstrumentationField.get(currentActivityThread);

        // 创建代理对象
//        Instrumentation evilInstrumentation = new EvilInstrumentation(mInstrumentation);
//
//        // 偷梁换柱
//        mInstrumentationField.set(currentActivityThread, evilInstrumentation);
    }


    public static void attchContext() throws Exception{
        /**
         * 获取当前Activity对象
         */
        Class<?> activityClass = Class.forName("android.app.Activity");

        Field mInstrumentationField = activityClass.getDeclaredField("mInstrumentation");

        Activity currentActivity = getCurrentActivity();

        Instrumentation mInstrumentation = (Instrumentation) mInstrumentationField.get(currentActivity);

    }


    public static Activity getCurrentActivity() throws Exception{
        //获取ActivityThread的类对象
        Class<?> currentActivityThreadClass =Class.forName("android.app.ActivityThread");
        //找到获取ActivityThread对象的方法
        Method activityThreadMethod =currentActivityThreadClass.getDeclaredMethod("currentActivityThread");
        activityThreadMethod.setAccessible(true);

        //找到当前的ActivityThread对象
        Object currentActivityThread = activityThreadMethod.invoke(null);

        /**
         * 找到字段Activity的集合
         */
        Field mActivitiesField = currentActivityThreadClass.getDeclaredField("mActivities");
        mActivitiesField.setAccessible(true);
        Map  activities = (Map) mActivitiesField.get(currentActivityThread);
        for(Object activityRecord:activities.values()){
            Class activityRecordClass = activityRecord.getClass();
            //获取Pause字段
            Field pausedField = activityRecordClass.getDeclaredField("paused");
            pausedField.setAccessible(true);
            if(!pausedField.getBoolean(activityRecord)){
                Field activityField = activityRecordClass.getDeclaredField("activity");
                Activity currentActivity = (Activity) activityField.get(activityRecord);
                return currentActivity;
            }
        }
        return  null;
    }



}
