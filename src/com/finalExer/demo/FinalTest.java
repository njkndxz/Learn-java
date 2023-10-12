package com.finalExer.demo;

public class FinalTest {
    final void say() {
        System.out.println("hello world");
    }
}

final class A extends FinalTest {
    final int age;
    public A() {
        super();
        //final修饰的成员变量可以在构造器中赋值
//        this.age = 20;
    }
    //final修饰的成员变量可以在代码块中赋值
    {
        this.age = 40;
    }
    void hi() {
        //final修饰的局部变量和成员变量不能修改，会变成常量
//        this.age = 20;
//        final String name = "aa";
//        name = "bb";

    }
//    void say() {} //final修饰的方法不能被重写
}

//class B extends A {} //final类不能被继承