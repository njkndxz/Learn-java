package com.abstractExer.demo;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.yall();
    }
}

abstract class Animal {
    String name;
    public abstract void eat();
    public abstract void yall();
}

final class Cat extends Animal {
    final String name = "Cat";
    public Cat() {
        super();
        super.name = this.name;
    }

    @Override
    public void eat() {
        System.out.println(super.name + "eating");
    }

    @Override
    public void yall() {
        System.out.println(super.name + "calling");
    }
}

final class Dog extends Animal {
    final String name = "Dog";
    public Dog() {
        super();
        super.name = this.name;
    }
    @Override
    public void eat() {
        System.out.println(super.name + "eating");
    }

    @Override
    public void yall() {
        System.out.println(super.name + "calling");
    }
}