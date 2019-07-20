package com.ssy.jdk8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/19 14:47
 * 方法引用是Lambda表达式的一种语法糖
 * 我们可以将方法引用看作是一个【函数指针】function pointer
 * 方法引用一共分为四种：
 * 1.类名::静态方法名
 * 2.对象名::实例方法名
 * 3.类名::实例方法名
 * 4.构造方法引用 类名::new
 **/
public class MethodReferenceTest {
    public String getStr(String str, Supplier<String> supplier){
        return supplier.get() + str;
    }
    public String getStr2(String str, Function<String,String> function){
        return function.apply(str);
    }
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("hello", "world", "hello world");
//        stringList.forEach(item-> System.out.println(item));
//        stringList.forEach(System.out::println);
        People p1 = new People("zhangsan", 10);
        People p2 = new People("lisi", 90);
        People p3 = new People("wangwu", 50);
        People p4 = new People("zhaoliu", 40);
        List<People> peoples = Arrays.asList(p1, p2, p3, p4);
        PeopleComparator peopleComparator = new PeopleComparator();
//        peoples.sort((o1,o2)->People.compareByAge1(o1,o2));
//        peoples.forEach(people -> System.out.println(people.getAge()));
        //类名::静态方法名
//        peoples.sort(People::compareByAge1);
//        peoples.forEach(people -> System.out.println(people.getAge()));
        //对象名::实例方法名
//        peoples.sort(peopleComparator::comparePeopleByAge);
//        peoples.forEach(people -> System.out.println(people.getAge()));
        //类名::实例方法名
        peoples.sort(People::compareByAge2);

        List<String> cities = Arrays.asList("chongqing","beijing","shenzheng","shanghai","tianjing");
        Collections.sort(cities,String::compareToIgnoreCase);
        cities.forEach(System.out::println);

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getStr("hello", String::new));

        System.out.println(methodReferenceTest.getStr2("nihao", String::new));

    }
}

class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareByAge1(People p1, People p2){
        return p1.getAge()-p2.getAge();
    }

    public static int compareByName(People p1, People p2){
        return p1.getName().compareToIgnoreCase(p2.getName());
    }

    public int compareByAge2(People p){
        return this.getAge() - p.getAge();
    }
}

class PeopleComparator {
    public int comparePeopleByAge(People p1, People p2){
        return p1.getAge() - p2.getAge();
    }
    public int comparePeopleByName(People p1, People p2){
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}