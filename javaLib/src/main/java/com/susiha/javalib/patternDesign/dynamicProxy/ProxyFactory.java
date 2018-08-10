package com.susiha.javalib.patternDesign.dynamicProxy;


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
                        System.out.println("代理开始");
                        System.out.println("首先看一下proxy是什么");
                        System.out.println(proxy.getClass().toString());
                        System.out.println("其次看一下method是什么");
                        System.out.println(method.toString());
                        System.out.println("-----------------");

                        if (args!=null&&args.length>0){
                            for(Object object:args){
                                System.out.println("表示有参数，看一下参数是什么");
                                System.out.println(object.toString());
                            }
                        }


                        System.out.println("-----------------");
                        Object value = method.invoke(target,args);
                        System.out.println("最后看一下返回的Value是什么");
                        System.out.println(value == null? "null":value.toString());
                        System.out.println("代理结束");
                        return value;
                    }
                });
    }



}
