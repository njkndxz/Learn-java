package com.abstractExer.demo;

public class AbstractTest {
    public static void main(String[] args) {
//        A a = new A(); //抽象类不能创建实例
        B b = new B();
        b.eat();
        System.out.println(b.age);
    }
}

abstract class A  {
    String name;
    int age;
    public A(){}
     public abstract void eat(); //抽象类方法没有方法体，而且只能在抽象类里面
}

class B extends A{
    public B() {
        super();
    }

    @Override
    public void eat() { //子类必须重写实现父类的抽象方法，才可以实例化，不然子类也是一个抽象类
        System.out.println("eating...");
    }
}