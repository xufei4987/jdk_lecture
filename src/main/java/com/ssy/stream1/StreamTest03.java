package com.ssy.stream1;

import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 19:00
 **/
public class StreamTest03 {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4, 5).map(i -> i * 2).reduce(0,Integer::sum));
        System.out.println(Stream.of(1, 2, 3, 4, 5).mapToInt(i -> i * 2).sum());
    }
}
