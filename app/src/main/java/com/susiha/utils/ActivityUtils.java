package com.susiha.utils;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.susiha.bean.ActivityBean;
import java.util.ArrayList;

/**
 * author:  sunshihai
 * createTime:  2018/8/14
 * desc:
 */

public class ActivityUtils {
    /**
     * 根据ActivityInfo 生成包含Activity name和label的List
     * @param infos
     * @return
     */
    public static ArrayList<ActivityBean> creatActivityBean(@NonNull PackageInfo infos){
        ArrayList<ActivityBean> activityBeans = new ArrayList<>();
         for(ActivityInfo activityInfo:infos.activities){
             if(!activityInfo.name.equals("com.susiha.androidbasiclist.MainActivity")){
                 ActivityBean bean = new ActivityBean();
                 if(TextUtils.isEmpty(activityInfo.nonLocalizedLabel)) {
                     String[] nameArray = activityInfo.name.split(".");
                     bean.setLabel(nameArray[nameArray.length-1]);
                 }else{
                     bean.setLabel(activityInfo.nonLocalizedLabel.toString());
                 }
                 bean.setFullName(activityInfo.name);
                 activityBeans.add(bean);
             }
         }
        return activityBeans;
    }




}
