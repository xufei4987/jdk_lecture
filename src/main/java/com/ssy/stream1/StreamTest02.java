package com.ssy.stream1;

import java.util.stream.IntStream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 18:57
 **/
public class StreamTest02 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3);
        intStream.forEach(System.out::println);
        System.out.println("------------");

        IntStream.range(3,5).forEach(System.out::println);
        System.out.println("------------");

        IntStream.rangeClosed(3,5).forEach(System.out::println);
        System.out.println("------------");
    }
}
