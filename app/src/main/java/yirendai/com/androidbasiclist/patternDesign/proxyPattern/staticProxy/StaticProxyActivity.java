package yirendai.com.androidbasiclist.patternDesign.proxyPattern.staticProxy;

import android.os.Bundle;
import android.support.annotation.Nullable;

import yirendai.com.androidbasiclist.BaseActivity;
import yirendai.com.androidbasiclist.R;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 静态代理模式测试类
 */

public class StaticProxyActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
        userDaoProxy.print();
        InheritProxy inheritProxy  = new InheritProxy(new InheritSubject());
        inheritProxy.print();
    }
}
