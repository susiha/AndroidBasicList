package com.susiha.androidbasiclist.patternDesign.proxyPattern.dynamicProxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 定义一个消费的接口
 */

public interface IConsumer {
    void pay(int money); //付款
    void buy(String goodsName); //购买
    void complain(); //投诉
}
