package com.ssy.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 14:31
 *
 * 不要将Optional作为函数的参数或者类的成员变量，因为Optional没有序列化
 **/
public class OptionalTest2 {

    private static Company company;

    static {
        Employee zhangsan = new Employee("zhangsan");
        Employee lisi = new Employee("lisi");
        company = new Company("aaa");
        company.setList(Arrays.asList(zhangsan,lisi));
    }

    public static void main(String[] args) {

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(cmp -> cmp.getList()).orElse(Collections.emptyList()));

    }

}
