package com.susiha.javalib.patternDesign.staticProxy;


/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 代理类
 */

public class UserDaoProxy implements IUserDao{

    private UserDao mUserDao;

    public UserDaoProxy(UserDao userDao){

        this.mUserDao = userDao;
    }
    @Override
    public void print() {

        System.out.print("before UserDao's print invoked by" + UserDaoProxy.class.getSimpleName());
        mUserDao.print();
        System.out.print("after UserDao's print invoked by" + UserDaoProxy.class.getSimpleName());

    }
}
