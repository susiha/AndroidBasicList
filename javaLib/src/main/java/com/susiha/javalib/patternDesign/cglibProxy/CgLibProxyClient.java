package com.susiha.javalib.patternDesign.cglibProxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/10
 * desc:
 */

public class CgLibProxyClient {

    public static void runCgLibProxy(){

        RealConsumer realConsumer = new RealConsumer("9527");

        RealConsumerCgLibProxy proxy = new RealConsumerCgLibProxy();

        RealConsumer consumer = (RealConsumer) proxy.getInstance(realConsumer);

        consumer.complain();

    }

}
