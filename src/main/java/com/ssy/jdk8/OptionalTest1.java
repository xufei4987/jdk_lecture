package com.ssy.jdk8;

import java.util.Optional;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/18 14:49
 **/
public class OptionalTest1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
//        Optional<String> optional = Optional.of("hello");
//        Optional<String> optional = Optional.ofNullable(null);
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        optional.ifPresent(System.out::println);
        System.out.println("-------------");

        System.out.println(optional.orElse("world"));
        System.out.println("-------------");

        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
