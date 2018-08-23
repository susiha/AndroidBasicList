package com.susiha.bean;

import java.io.Serializable;

/**
 * author:  sunshihai
 * createTime:  2018/8/14
 * desc:
 */

public class ActivityBean implements Serializable{

    private String label; //Activity 的标签
    private String fullName; //Activity 的全名

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
