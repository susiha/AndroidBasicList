package com.susiha.javalib.patternDesign.cglibProxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/10
 * desc: 顶一个一个消费者类，具有各种功能
 */

public class RealConsumer {

    private String idNum;//消费者的idNum

    public RealConsumer(String idNum){

        this.idNum = idNum;
    }

    public void login(String channel) {

        System.out.println("idNum 为" + idNum + "的消费者通过" + channel +"登录");

    }

    public void logout() {
        System.out.println("idNum 为" + idNum + "的消费者退出登录");
    }



    public void pay(int money) {

        System.out.print("idNum 为" + idNum + "的消费者付款" + money);

    }


    public void buy(String goodsName) {

        System.out.print("idNum 为" + idNum + "的消费者购买了" + goodsName);
    }


    public void complain() {

        System.out.print("idNum 为" + idNum + "的消费者进行了投诉");

    }

}
