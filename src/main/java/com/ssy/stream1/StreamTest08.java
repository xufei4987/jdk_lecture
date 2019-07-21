package com.ssy.stream1;

import java.util.stream.IntStream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/20 16:43
 *
 **/
public class StreamTest08 {
    public static void main(String[] args) {
        //这里distinct会产生一个无限的操作，所以程序不会停止
//        IntStream.iterate(0, i -> (i+1) % 2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0, i -> (i+1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
