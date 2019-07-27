package com.ssy.stream2;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/25 17:32
 * lambda表达式与匿名内部类有本质上的区别，匿名内部类开辟了新的作用域，而lambda表达式就是外层的作用域。
 **/
public class LambdaTest {
    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            //匿名内部类的this对象
            System.out.println(this);
            //匿名内部类的外部类的this对象
            System.out.println(LambdaTest.this);
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        System.out.println(lambdaTest);

        new Thread(lambdaTest.r1).start();

        new Thread(lambdaTest.r2).start();
    }
}
