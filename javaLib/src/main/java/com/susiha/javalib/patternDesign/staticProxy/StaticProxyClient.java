package com.susiha.javalib.patternDesign.staticProxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/9
 * desc:
 */

public class StaticProxyClient {


    /**
     * 运行实现接口方式的静态代理
     */
    public static void runRealizationStaticProxy(){

        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
        userDaoProxy.print();
    }

    /**
     * 运行继承方式的静态代理
     */
    public static void runInheritStaticProxy(){
        InheritProxy inheritProxy  = new InheritProxy(new InheritSubject());
        inheritProxy.print();
    }



}
