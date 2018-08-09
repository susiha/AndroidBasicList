package yirendai.com.androidbasiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yirendai.com.androidbasiclist.patternDesign.proxyPattern.dynamicProxy.IConsumer;
import yirendai.com.androidbasiclist.patternDesign.proxyPattern.dynamicProxy.ProxyFactory;
import yirendai.com.androidbasiclist.patternDesign.proxyPattern.dynamicProxy.RealConsumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RealConsumer  realConsumer = new RealConsumer("9527");



        ProxyFactory proxyFactory = new ProxyFactory(realConsumer);
        IConsumer prxoy = (IConsumer) proxyFactory.getProxyInstance();


        prxoy.buy("大疆飞行器");

        prxoy.pay(11235);

        prxoy.complain();


    }
}
