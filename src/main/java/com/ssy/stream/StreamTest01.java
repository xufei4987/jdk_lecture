package com.ssy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 17:48
 * stream流由三部分构成：
 * 1.源
 * 2.零个或多个中间操作
 * 3.终止操作
 * 流操作的分类：
 * 1.惰性求值 中间操作不会执行，直到终止操作执行
 * 2.及早求值 终止操作执行会立即得到结果
 **/
public class StreamTest01 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("hello", "world", "hello world");

        String[] strings = {"hello", "world", "hello world"};
        Stream<String> stream2 = Stream.of(strings);

        List<String> list = Arrays.asList(strings);
        Stream<String> stream3 = list.stream();
    }
}
