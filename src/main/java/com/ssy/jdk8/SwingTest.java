package com.ssy.jdk8;

import javax.swing.*;


/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 11:45
 *
 * Lambda表达式的基本结构
 * （param1,param2,...）->{}
 * 函数式接口：
 * 1.如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口。
 * 2.如果我们在某个接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要求该接口。
 * 3.如果某个接口只有一个抽象方法，但我们并没有给该接口声明FunctionalInterface注解，那么编译器依旧会将该接口看作是函数式接口。
 *
 * Lambda表达式的类型是函数，但在java中Lambda表达式是对象，该对象继承与object类并实现了一个函数式接口。
 **/
public class SwingTest {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("myFrame");
        JButton myButton = new JButton("myButton");

        myButton.addActionListener(e -> System.out.println("button pressed"));
        myFrame.add(myButton);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
