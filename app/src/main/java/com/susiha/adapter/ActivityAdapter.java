package com.susiha.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.susiha.androidbasiclist.R;
import com.susiha.bean.ActivityBean;

import java.util.ArrayList;

/**
 * author:  sunshihai
 * createTime:  2018/8/14
 * desc:
 */

public class ActivityAdapter extends Adapter<ActivityAdapter.MViewHolder> {

    private ArrayList<ActivityBean> mActivityBeans;
    private Context mContext;


    public ActivityAdapter(@NonNull ArrayList<ActivityBean> beans, Context context){

        this.mActivityBeans = beans;
        this.mContext = context;

    }


    @Override
    public MViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MViewHolder mViewHolder = new MViewHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_item,parent,false));
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(MViewHolder holder, final int position) {
        holder.textView.setText(mActivityBeans.get(position).getLabel());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();


                try {
                    intent.setClass(mContext,Class.forName(mActivityBeans.get(position).getFullName()));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mActivityBeans.size();
    }


    class MViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public MViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.activity_item_text);
        }
    }


}
