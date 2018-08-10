package com.susiha.javalib.patternDesign.dynamicProxy;



/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc:
 */

public class RealConsumer implements IConsumer,IPerson{

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


    @Override
    public void pay(int money) {

        System.out.print("idNum 为" + idNum + "的消费者付款" + money);

    }

    @Override
    public void buy(String goodsName) {

        System.out.print("idNum 为" + idNum + "的消费者购买了" + goodsName);
    }

    @Override
    public void complain() {

        System.out.print("idNum 为" + idNum + "的消费者进行了投诉");

    }


    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("idNum 为" + idNum + "的消费者走了过来");
    }


    @Override
    public void say(String word,String anthorOne) {
        // TODO Auto-generated method stub
        System.out.println("idNum 为" + idNum + "的消费者对"+anthorOne+"说了"+word);
    }
}
