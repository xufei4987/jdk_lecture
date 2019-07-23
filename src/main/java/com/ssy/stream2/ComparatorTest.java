package com.ssy.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/22 16:53
 **/
public class ComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");
//        Collections.sort(list, (item1,item2)->item1.length()-item2.length());
//        System.out.println(list);
//        Collections.sort(list, (item1,item2)->item2.length()-item1.length());
//        System.out.println(list);

//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        Collections.sort(list, Comparator.comparingInt((String item)->item.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length).reversed());

//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String::toLowerCase,Comparator.reverseOrder()));
//        Collections.sort(list,Comparator.comparingInt(String::length).reversed().thenComparing(String::toLowerCase,Comparator.reverseOrder()));

        Collections.sort(list,Comparator.comparingInt(String::length)
                .thenComparing(String::toLowerCase,Comparator.reverseOrder())
                .thenComparing(Comparator.reverseOrder()));





        System.out.println(list);


    }
}
