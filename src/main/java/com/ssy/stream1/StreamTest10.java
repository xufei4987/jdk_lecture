package com.ssy.stream1;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1","world1","hello world");
        list.stream().mapToInt(item -> {
            System.out.println(item);
            return item.length();
        }).filter(item -> item == 5).findFirst().ifPresent(System.out::println);

    }
}
