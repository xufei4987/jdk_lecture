package com.ssy.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/25 14:33
 **/
public class ConsumerTest {
    public void test(Consumer<Integer> consumer){
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        Consumer<Integer> consumer = x -> System.out.println(x);
        IntConsumer intConsumer = x -> System.out.println(x);

        consumerTest.test(consumer);
        consumerTest.test(intConsumer::accept);
    }
}
