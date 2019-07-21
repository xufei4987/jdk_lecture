package com.ssy.stream1;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/20 15:49
 **/
public class StreamTest06 {
    public static void main(String[] args) {
        Stream<String> generate = Stream.generate(UUID.randomUUID()::toString);
        generate.findFirst().ifPresent(System.out::println);
        System.out.println("---------");

        System.out.println(Stream.iterate(1, item -> item + 2).limit(10)
                .filter(item -> item > 2)
                .map(item->item*2)
                .skip(2)
                .limit(2)
                .reduce(0, Integer::sum));
        System.out.println("----------------");

        IntSummaryStatistics intSummaryStatistics =
                Stream.iterate(1, item -> item + 2).limit(10)
                .filter(item -> item > 2)
                .mapToInt(item -> item * 2)
                .skip(2)
                .limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println("----------------");

        IntStream intStream = Stream.iterate(1, item -> item + 2).limit(10)
                .filter(item -> item > 2)
                .mapToInt(item -> item * 2)
                .skip(2)
                .limit(2);
        //不能对一个流进行重复操作，也不能操作一个已经关闭的流
//        System.out.println(intStream);
//        System.out.println(intStream.filter(item -> item > 2));
//        System.out.println(intStream.distinct());

        System.out.println(intStream);
        IntStream filter = intStream.filter(item -> item > 2);
        System.out.println(filter);
        IntStream distinct = filter.distinct();
        System.out.println(distinct);
    }
}
