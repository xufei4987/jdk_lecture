package com.ssy.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/25 10:31
 * ReferencePipeline表示流的源阶段和中间阶段
 * ReferencePipeline.Head表示流的源阶段
 * 二者在大部分属性的设定上都是类似的，但存在一些属性是不同的，比如说Head是没有previousStage的，而ReferencePipeline则是存在的
 **/
public class StreamTest03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","person","son","alibaba");
        //流源执行终止操作
//        list.stream().forEach(System.out::println);

        list.stream().map(x -> x + "_123").forEach(System.out::println);
        StreamTest03 streamTest03 = new StreamTest03();
        streamTest03.test();
        System.out.println(streamTest03);
    }
    public void test(){
        System.out.println(StreamTest03.this);
    }

}
