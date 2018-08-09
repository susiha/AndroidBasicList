package com.susiha.androidbasiclist.patternDesign.proxyPattern.staticProxy;

import android.util.Log;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 目标类
 */

public class UserDao implements IUserDao{

    @Override
    public void print() {
        Log.i(UserDao.class.getName(),"UserDao's print be Invoked");
    }
}
