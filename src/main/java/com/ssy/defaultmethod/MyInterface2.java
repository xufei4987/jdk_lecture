package com.ssy.defaultmethod;

public interface MyInterface2 {
    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
