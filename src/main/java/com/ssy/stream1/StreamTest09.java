package com.ssy.stream1;

import java.util.ArrayList;
import java.util.UUID;

public class StreamTest09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++){
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("begin sorting");

        long startTime = System.currentTimeMillis();

//        list.stream1().sorted().count();
        list.parallelStream().sorted().count();

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
