package com.ssy.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/18 9:43
 **/
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        //找出所有偶数
        predicateTest2.conditionFilter(list, p -> p%2 == 0);

        System.out.println("------------");

        //找出所有奇数
        predicateTest2.conditionFilter(list, p -> p%2 != 0);

        System.out.println("-------------");

        //找出所有数
        predicateTest2.conditionFilter(list, p -> true);

        System.out.println("-------------");

        //找出大于5且为偶数
        predicateTest2.conditionFilter2(list, p -> p > 5, p -> p % 2 ==0);

        String str = "y123";
        System.out.println(Predicate.isEqual(str).test("y1234"));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
//        list.stream1().filter(predicate).forEach(System.out::println);
        for (Integer i : list){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2){
        for (Integer i : list){
            if(predicate1.and(predicate2).negate().test(i)){
                System.out.println(i);
            }
        }
    }

}
