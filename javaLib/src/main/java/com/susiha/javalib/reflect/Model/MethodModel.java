package com.susiha.javalib.reflect.Model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * author:  sunshihai
 * createTime:  2018/8/23
 * desc: 方法的基本信息
 */

public class MethodModel {

    int modifier;//访问修饰符
    Class returnType; //返回类型

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public Class getReturnType() {
        return returnType;
    }

    public void setReturnType(Class returnType) {
        this.returnType = returnType;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Type[] getParams() {
        return params;
    }

    public void setParams(Type[] params) {
        this.params = params;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotation[] annotations) {
        this.annotations = annotations;
    }

    String methodName; //方法名称
    Type[] params;
    Annotation[] annotations;





}
