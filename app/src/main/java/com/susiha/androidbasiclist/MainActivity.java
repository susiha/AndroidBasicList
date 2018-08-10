package com.susiha.androidbasiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.susiha.javalib.patternDesign.dynamicProxy.DynamicProxyClient;

import yirendai.com.androidbasiclist.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DynamicProxyClient.runDynamicProxy();
        DynamicProxyClient.generatorProxyClass();


    }
}
