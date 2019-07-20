package com.ssy.jdk8;

import java.util.List;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 14:30
 **/
public class Company {
    private String name;
    private List<Employee> list;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
