package com.susiha.androidbasiclist;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.susiha.adapter.ActivityAdapter;
import com.susiha.adapter.DividerItemDecoration;
import com.susiha.utils.ActivityUtils;

public class MainActivity extends BaseActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        PackageInfo packageInfo =null;
        PackageManager packageManager = getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.susiha.androidbasiclist",PackageManager.GET_ACTIVITIES);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setAdapter(new ActivityAdapter(ActivityUtils.creatActivityBean(packageInfo),this));
    }



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);

    }
}
