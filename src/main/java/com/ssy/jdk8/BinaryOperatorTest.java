package com.ssy.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/18 13:57
 **/
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(4, 2, (a, b) -> a + b));
        System.out.println(binaryOperatorTest.compute(4, 2, (a, b) -> a * b));
        System.out.println(binaryOperatorTest.compute(4, 2, (a, b) -> a / b));
        System.out.println(binaryOperatorTest.compute(4, 2, (a, b) -> a - b));

        String shortStr1 = binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.length() - b.length());
        System.out.println(shortStr1);
        String shortStr2 = binaryOperatorTest.getShort("ahello123", "bworld", (a, b) -> a.charAt(0) - b.charAt(0));
        System.out.println(shortStr2);
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }

    public String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }


}
