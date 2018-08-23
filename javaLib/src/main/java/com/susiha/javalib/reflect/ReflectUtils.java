package com.susiha.javalib.reflect;
import com.susiha.javalib.reflect.Model.MethodModel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * author:  sunshihai
 * createTime:  2018/8/23
 * desc: 反射的工具类
 */

public class ReflectUtils<T> {
    /**
     * 通过对象获取Class 类
     * @param object
     * @return
     */
    public Class getClass(Object object){
        return object.getClass();
    }

    /**
     * 通过类的全称获取Class类
     * @param classPath
     * @return
     * @throws Exception
     */
    public Class getClass(String classPath) throws Exception{
        return Class.forName(classPath);
    }
    /**
     *
     * 获取T类的所有声明为Public的方法 包括父类的
     * @param param
     */

    public ArrayList<MethodModel> getMethods(T param){
        ArrayList<MethodModel> methodList = new ArrayList<>();
        Class clazz = getClass(param);
        /**
         * 获取方法列表
         */
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            methodList.add(getMethodModelInfo(method));
        }
        return methodList;
    }

    /**
     * 返回方法的修饰符
     * @param method
     * @return
     */
    public int getMethodModifier(Method method){

        return method.getModifiers();
    }

    /**
     * 返回方法的名称
     * @param method
     * @return
     */
    public String getMethodName(Method method){
        return method.getName();
    }


    /**
     * 返回 方法的返回类型
     * @param method
     * @return
     */
    public Class getMethodReturnType(Method method){
        return method.getReturnType();
    }

    /**
     * 返回方法的参数信息
     * @param method
     * @return
     */
    public Type[] getMethodParams(Method method){
        return method.getGenericParameterTypes();
    }


    /**
     * 返回方法的注解信息
     * @param method
     * @return
     */
    public Annotation[] getMethodAnnotations(Method method){
        return method.getAnnotations();
    }


    public MethodModel getMethodModelInfo(Method method){
        MethodModel model = new MethodModel();
        model.setAnnotations(getMethodAnnotations(method));
        model.setMethodName(getMethodName(method));
        model.setModifier(getMethodModifier(method));
        model.setParams(getMethodParams(method));
        model.setReturnType(getMethodReturnType(method));
        return model;


    }




















}
