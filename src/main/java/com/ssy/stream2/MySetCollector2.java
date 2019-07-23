package com.ssy.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/22 19:52
 **/
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T,T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return ()->{
            System.out.println("------------");
            return new HashSet<>();
        };
    }

    //如果一个线程在修改容器的内容，而另一个线程在迭代容器，就会发生ConcurrentModificationException异常,ConcurrentModificationException
    //因此容器收集器标示为Characteristics.CONCURRENT后不宜在accumulator中做额外的操作。
    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set,item)->{
            set.add(item);
            System.out.println("accumulator:" + set + ", " + Thread.currentThread().getName());
        };
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
    public Function<Set<T>, Map<T,T>> finisher() {
        System.out.println("finisher invoked");
        return set -> set.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i<1; i++){
            List<String> list = Arrays.asList("hello", "world", "welcome", "hello","a","b","c","e","f","cc","aa","ee","22");
            Map<String, String> map = list.parallelStream().collect(new MySetCollector2<>());
            System.out.println(map);
        }

    }
}
