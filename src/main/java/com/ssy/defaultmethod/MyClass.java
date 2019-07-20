package com.ssy.defaultmethod;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 17:29
 * 引入默认方法是为了对老版本JDK的兼容
 **/
//public class MyClass extends MyInterface1Impl implements MyInterface2{
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        //调用实现类的myMethod 实现类的更加具体化
//        myClass.myMethod();
//    }
//}

public class MyClass implements MyInterface1,MyInterface2{

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }

    @Override
    public void myMethod() {
        //调用MyInterface2的默认方法
        MyInterface2.super.myMethod();
    }
}
