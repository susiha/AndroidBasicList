package com.susiha.androidbasiclist.patternDesign.proxyPattern.staticProxy;

import android.util.Log;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc:
 */

public class InheritSubject extends InheritBase {

    @Override
    public void print() {
        Log.i(InheritSubject.class.getName(),"InheritSubject 's print be invoked");
    }
}
