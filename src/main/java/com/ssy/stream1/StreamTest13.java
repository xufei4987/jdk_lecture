package com.ssy.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分组与分区
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 20, 100);
        Student student2 = new Student("lisi", 20, 90);
        Student student3 = new Student("wangwu", 30, 90);
        Student student4 = new Student("zhangsan", 40, 80);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);
        Map<Integer, List<Student>> map1 = students.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map1);
        Map<Integer, Long> map2 = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
        System.out.println(map2);
        Map<String, Double> map3 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(map3);
        System.out.println("--------------");

        Map<Boolean, List<Student>> map4 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map4.get(true));
    }
}
