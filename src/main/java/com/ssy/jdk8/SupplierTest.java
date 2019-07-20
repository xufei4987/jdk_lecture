package com.ssy.jdk8;

import java.util.function.Supplier;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/18 11:27
 **/
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        System.out.println("-------------");

        //构造方法引用
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getAge());
    }
}
