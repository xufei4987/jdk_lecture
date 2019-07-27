package com.ssy.autoCloseable;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/24 15:08
 **/
public class AutoCloseableTest implements AutoCloseable{

    public static void main(String[] args) {
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("close invoked");
    }

    public void doSomething(){
        System.out.println("doSomething invoked");
    }

}
