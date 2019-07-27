package com.ssy.autoBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/24 10:21
 **/
public class MyInteger {
    private final int value;
    public MyInteger(){
        this.value = 0;
    }
    public MyInteger(int value){
        this.value = value;
    }
    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }
    public int intValue() {
        return value;
    }

    public static void main(String[] args) {


    }

}
