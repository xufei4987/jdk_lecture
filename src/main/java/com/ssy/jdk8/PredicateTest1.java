package com.ssy.jdk8;

import java.util.function.Predicate;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/18 9:37
 **/
public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("helloworld"));
    }
}
