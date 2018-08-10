package com.susiha.javalib.patternDesign.staticProxy;


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

        System.out.print("before InheritSubject's print invoked");
        inheritSubject.print();
        System.out.print("after InheritSubject's print invoked");

    }
}
