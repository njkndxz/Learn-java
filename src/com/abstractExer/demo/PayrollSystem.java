package com.abstractExer.demo;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("mike", 1001, new MyDate(2000, 1, 1), 10000);
        emps[1] = new HourlyEmployee("alan", 1002, new MyDate(2000, 2 ,2), 240, 50);
        System.out.println("请输入当前月份：");

        int month = scanner.nextInt();


        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            System.out.println("工资为：" + emps[i].earnings());
            if(month == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐!加薪1000");
                System.out.println(emps[i].toString());
                System.out.println("工资为：" + (emps[i].earnings() + 1000));
            }
        }
        scanner.close();

    }
}
