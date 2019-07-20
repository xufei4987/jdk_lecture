package com.ssy.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 15:46
 **/
public class Test03 {
    public static void main(String[] args) {
        //lambda表达式需要通过上下文进行类型推断
        Test03Interface1 test03Interface1 = () -> {};
        System.out.println(test03Interface1.getClass().getInterfaces()[0]);

        Test03Interface2 test03Interface2 = () -> {};
        System.out.println(test03Interface2.getClass().getInterfaces()[0]);

        Runnable runnable = () -> {
            System.out.println("hello world");
        };
        new Thread(runnable).start();

        List<String> stringList1 = Arrays.asList("hello", "world", "hello world");
//        stringList1.forEach(str -> System.out.println(str.toUpperCase()));

        List<String> stringList2 = new ArrayList<>();
//        stringList1.forEach(str -> stringList2.add(str.toUpperCase()));
//        stringList2.forEach(System.out::println);
//        stringList2 = stringList1.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
//        stringList2.forEach(System.out::println);
        stringList1.stream().map(String::toUpperCase).forEach(System.out::println);

        //方法引用
        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface Test03Interface1{
    void myMethod();
}

@FunctionalInterface
interface Test03Interface2{
    void myMethod();
}
