package com.susiha.javalib.patternDesign.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author:  sunshihai
 * createTime:  2018/8/10
 * desc:
 */

public class RealConsumerCgLibProxy implements MethodInterceptor {

    private Object target; //需要代理的对象


    public Object getInstance(Object target){

        this.target = target;
        Enhancer enhancer = new Enhancer(); //字节码增强器
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预处理——————");
        methodProxy.invokeSuper(o, objects); //调用业务类（父类中）的方法
        System.out.println("调用后操作——————");
        return null;
    }
}
