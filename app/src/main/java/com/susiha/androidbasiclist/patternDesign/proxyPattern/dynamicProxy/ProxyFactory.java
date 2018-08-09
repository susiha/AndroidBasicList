package com.susiha.androidbasiclist.patternDesign.proxyPattern.dynamicProxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc:
 */

public class ProxyFactory {

    //维护一个目标对象
    private  Object target;


    public ProxyFactory(Object target){
        this.target = target;
    }


    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Log.i(ProxyFactory.class.getName(),"before be Proxyed");
                        Log.i(ProxyFactory.class.getName(),proxy.getClass().getName());

                        Log.i(ProxyFactory.class.getName(),method.toString());
                        Log.i(ProxyFactory.class.getName(),"-----------------");

                        if (args!=null&&args.length>0){
                            for(Object object:args){
                                Log.i(ProxyFactory.class.getName(),object.getClass().getName());
                            }
                        }


                        Log.i(ProxyFactory.class.getName(),"-----------------");

                        Object value = method.invoke(target,args);
                        Log.i(ProxyFactory.class.getName(),"after be Proxyed");
                        return value;
                    }
                });
    }



}
