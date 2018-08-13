package com.susiha.androidbasiclist.dynamicProxyHook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.susiha.androidbasiclist.BaseActivity;

import yirendai.com.androidbasiclist.R;

/**
 * author:  sunshihai
 * createTime:  2018/8/13
 * desc:
 */

public class DynamicProxyHookMainActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dynamicproxyhookmainlayout);


        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is originlly",Toast.LENGTH_LONG).show();
            }
        });

    }
}
