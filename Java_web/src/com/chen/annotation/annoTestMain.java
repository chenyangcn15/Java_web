package com.chen.annotation;

@pro(className = "com.chen.annotation.AnnoTest", methodName = "show")
public class annoTestMain {
    public static void main(String[] args) {
        Class<annoTestMain> a = annoTestMain.class;
        pro p = a.getAnnotation(pro.class);
        String methodName = p.methodName();
        System.out.println(methodName);
    }
}
