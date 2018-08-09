package yirendai.com.androidbasiclist.patternDesign.proxyPattern.staticProxy;

import android.util.Log;

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

        Log.i(UserDaoProxy.class.getName(),"before UserDao's print invoked");
        mUserDao.print();
        Log.i(UserDaoProxy.class.getName(),"after UserDao's print invoked");

    }
}
