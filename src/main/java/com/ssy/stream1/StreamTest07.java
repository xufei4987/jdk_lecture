package com.ssy.stream1;

import java.util.Arrays;
import java.util.List;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/20 16:34
 **/
public class StreamTest07 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world", "hello world");

        stringList.stream()
                .map(item -> {
                    String str = item.substring(0,1).toUpperCase() + item.substring(1);
                    System.out.println("Test");
                    return str;
                    })
                .forEach(System.out::println);
    }
}
