package com.susiha.androidbasiclist.patternDesign.proxyPattern.dynamicProxy;


import android.util.Log;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc:
 */

public class RealConsumer implements IConsumer {

    private String idNum;//消费者的idNum

    public RealConsumer(String idNum){

        this.idNum = idNum;
    }


    @Override
    public void pay(int money) {

        Log.i(RealConsumer.class.getName(),"idNum 为" + idNum + "的消费者付款" + money);

    }

    @Override
    public void buy(String goodsName) {

        Log.i(RealConsumer.class.getName(),"idNum 为" + idNum + "的消费者购买了" + goodsName);
    }

    @Override
    public void complain() {

        Log.i(RealConsumer.class.getName(),"idNum 为" + idNum + "的消费者进行了投诉");

    }
}
