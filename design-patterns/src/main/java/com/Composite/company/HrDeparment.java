package com.Composite.company;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : HrDeparment.java
//  @ Date : 2016/9/30
//  @ Author : 
//
//

public class HrDeparment extends Company {
    public HrDeparment(String name) {
        super(name);
    }

    public void add(Company company) {

    }

    public void remove(Company company) {

    }

    public void show(int depth) {
        System.out.println(new String("-" + depth) + " " + name);
    }

    public void lineofDuty() {
        System.out.println(name+"   员工招聘培训管理");

    }
}