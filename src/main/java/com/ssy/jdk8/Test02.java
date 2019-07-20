package com.ssy.jdk8;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 14:17
 **/
public class Test02 {
    public void myTest(MyInterface myInterface){
        System.out.println("1");
        myInterface.test();
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.myTest(() -> {
            System.out.println("myTest");
        });
        System.out.println("-------------,");
        MyInterface myInterface = () -> {
            System.out.println("myTest");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface MyInterface{
    void test();
    String toString();
}
