package com.ssy.stream2;

import java.util.Arrays;
import java.util.List;


import static java.util.stream.Collectors.*;

/**
 * collector是一个接口，它是一个可变的汇聚操作，将输入元素积累到一个可变的结果容器中；它会在所有元素都
 * 处理完毕后，将累计的结果转换为一个最终的表示；它支持串行和并行两种方式执行。
 *
 * collectors本身提供了关于collector的常见的汇聚实现，Collectors本身是一个工厂。
 *
 * 构成collector的四个方法supplier,accumulator,combiner,finisher
 *
 * 为了确保串行与并行操作结果的等价性，Collector函数需要满足两个条件：identity（同一性）与associativity（结合性）
 * 同一性：a == combiner.apply(a, supplier.get())   (list1,list2) -> {list1.addAll(list2);return list1;}
 */
public class StreamTest01 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        List<Student> students1 = students.stream().collect(toList());
        students1.forEach(System.out::println);
        System.out.println(students.equals(students1));
        System.out.println("count:" + students.stream().count());
        System.out.println("count:" + students.stream().collect(counting()));
    }
}
