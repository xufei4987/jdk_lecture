package com.ssy.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/22 19:52
 * 对于Collectors静态工厂类来说，其实现一共分为两种情况：
 * 1.通过CollectorImpl来实现。
 * 2.通过reducing方法来实现，reducing方法本身又是通过ColletorImpl实现。
 **/
public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return Set::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1,set2)->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH,Characteristics.UNORDERED));
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello");
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);
    }
}
