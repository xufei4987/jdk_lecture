package com.ssy.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 16:37
 **/
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();
        System.out.println(test2.compute1(2, val -> val * 3, val -> val * val));
        System.out.println(test2.compute2(2, val -> val * 3, val -> val * val));
        System.out.println(test2.compute3(6, 3, (val1, val2) -> val1 + val2));
        System.out.println(test2.compute3(6, 3, (val1, val2) -> val1 - val2));
        System.out.println(test2.compute3(6, 3, (val1, val2) -> val1 * val2));
        System.out.println(test2.compute3(6, 3, (val1, val2) -> val1 / val2));
        System.out.println(test2.compute4(6, 3, (val1, val2) -> val1 + val2, val -> val * val));
    }

    public int compute1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> function){
        return function.apply(a,b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function){
        return biFunction.andThen(function).apply(a,b);
    }

}
