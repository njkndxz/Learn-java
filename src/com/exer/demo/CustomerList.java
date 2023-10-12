package com.exer.demo;

import java.util.Arrays;

public class CustomerList {
    private Customer[] customers; //用来保存客户对象的数组
    private int total = 0;        //记录已保存客户对象的数量
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total > this.customers.length) {
            return false;
        }else {
            this.customers[total] = customer;
            total++;
            return true;
        }
    }
    public boolean replaceCustomer(int index, Customer cust){
        if(index >= 0 && index < this.total) {
            this.customers[index] = cust;
            return true;
        }else {
            return false;
        }
    }
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= this.total) {
            return false;
        }else {
            for (int i = index; i < this.total - 1; i++) {
                this.customers[i] = this.customers[i + 1];
            }
            this.customers[--this.total] = null;
            return true;
        }
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[this.total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = this.customers[i];
        }
        return  custs;
    }
    public Customer getCustomer(int index){
        if(index < 0 || index >= this.total) {
            return null;
        }else {
            return this.customers[index];
        }
    }
    public int getTotal(){
        return this.total;
    }

}
