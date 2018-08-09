package yirendai.com.androidbasiclist.patternDesign.proxyPattern.staticProxy;

import android.util.Log;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc:
 */

public class InheritProxy extends InheritBase {

    private InheritSubject inheritSubject;

    public InheritProxy(InheritSubject inheritSubject){
        this.inheritSubject = inheritSubject;
    }
    @Override
    public void print() {

        Log.i(InheritProxy.class.getName(),"before InheritSubject's print invoked");
        inheritSubject.print();
        Log.i(InheritProxy.class.getName(),"after InheritSubject's print invoked");

    }
}
