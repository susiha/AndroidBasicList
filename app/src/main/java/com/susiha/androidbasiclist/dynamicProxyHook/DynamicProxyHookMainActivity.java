package com.susiha.androidbasiclist.dynamicProxyHook;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.susiha.androidbasiclist.BaseActivity;
import com.susiha.androidbasiclist.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * author:  sunshihai
 * createTime:  2018/8/13
 * desc:
 */

public class DynamicProxyHookMainActivity extends BaseActivity{

    private String TAG = "DynamicProxyHookMainActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG,"onCreate was invoked");

        setContentView(R.layout.dynamicproxyhookmainlayout);


        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is originlly",Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        Log.i(TAG,"attachBaseContext  was invoked");




    }
}
