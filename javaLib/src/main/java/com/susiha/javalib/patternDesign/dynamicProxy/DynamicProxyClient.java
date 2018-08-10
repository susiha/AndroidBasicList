package com.susiha.javalib.patternDesign.dynamicProxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

/**
 * author:  sunshihai
 * createTime:  2018/8/9
 * desc:
 */

public class DynamicProxyClient {


    public static void runDynamicProxy(){


        RealConsumer  realConsumer = new RealConsumer("9527");
        ProxyFactory proxyFactory = new ProxyFactory(realConsumer);
        IConsumer proxy = (IConsumer) proxyFactory.getProxyInstance();
        IPerson proxyPerson = (IPerson) proxyFactory.getProxyInstance();
        proxy.buy("大疆飞行器");

        proxy.pay(11235);

        proxy.complain();

        proxyPerson.say("hi","sunshihai");

        proxyPerson.walk();

    }
    public static void generatorProxyClass(){

        byte[] classFile =ProxyGenerator.generateProxyClass("$Proxy0",RealConsumer.class.getInterfaces());


        File appDir = new File("/sdcard/proxy");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        String fileName = "RealConsumer" + ".class";
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(classFile);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
