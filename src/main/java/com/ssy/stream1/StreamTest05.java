package com.ssy.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 19:47
 **/
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "hello world", "test");
        strings.stream()
                .map(item -> String.valueOf(Character.toUpperCase(item.charAt(0))) + item.substring(1))
                .forEach(System.out::println);

        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6, 7));
        listStream.flatMap(theList -> theList.stream().map(item -> item*item)).forEach(System.out::println);

    }

}
