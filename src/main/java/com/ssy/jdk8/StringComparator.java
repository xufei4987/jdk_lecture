package com.ssy.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 16:20
 **/
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);

        System.out.println("-----------------");
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
        System.out.println(names);

        System.out.println("-----------------");
        Collections.sort(names, Comparator.naturalOrder());
        System.out.println(names);
    }
}
