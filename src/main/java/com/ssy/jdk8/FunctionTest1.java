package com.ssy.jdk8;

import java.util.function.Function;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 16:37
 * 高阶函数：一个函数接收一个函数作为参数，或者用一个函数作为返回值则称为高阶函数。
 **/
public class FunctionTest1 {
    public static void main(String[] args) {
        FunctionTest1 functionTest = new FunctionTest1();
        int result1 = functionTest.compute(1, value -> value * 2);
        System.out.println(result1);
        int result2 = functionTest.compute(2, value -> value + 5);
        System.out.println(result2);
        int result3 = functionTest.compute(3, value -> value * value);
        System.out.println(result3);
        String result4 = functionTest.convert(3, value -> value + " hello");
        System.out.println(result4);
    }

    public int compute(int a, Function<Integer, Integer> function){
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function){
        return function.apply(a);
    }
}
