package com.ssy.stream1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 19:10
 **/
public class StreamTest04 {
    public static void main(String[] args) {
//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        String[] strings = stringStream.toArray(String[]::new);
//        Arrays.asList(strings).forEach(System.out::println);

//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        List<String> stringList = stringStream.collect(Collectors.toList());
//        stringList.forEach(System.out::println);

//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        List<String> stringList = stringStream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
//        stringList.forEach(System.out::println);

//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        List<String> stringList = stringStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        stringList.forEach(System.out::println);

//        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        ArrayList<String> stringList = stringStream.collect(Collectors.toCollection(ArrayList::new));
//        stringList.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
        System.out.println(stringStream.collect(Collectors.joining()));
    }
}
