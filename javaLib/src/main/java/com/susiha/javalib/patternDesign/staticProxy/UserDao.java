package com.susiha.javalib.patternDesign.staticProxy;


/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 目标类
 */

public class UserDao implements IUserDao{

    @Override
    public void print() {
       System.out.print("UserDao's print be Invoked by" + UserDao.class.getSimpleName());
    }
}
