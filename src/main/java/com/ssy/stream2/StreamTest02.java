package com.ssy.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/24 16:23
 **/
public class StreamTest02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("11", "22", "33");
        try (Stream<String> stream = list.stream()){
            stream.onClose(() -> {
                System.out.println("aaa");
                throw new NullPointerException("first exception");
            }).onClose(() -> {
                System.out.println("bbb");
                throw new NullPointerException("second exception");
            }).forEach(System.out::println);
        }

    }
}
