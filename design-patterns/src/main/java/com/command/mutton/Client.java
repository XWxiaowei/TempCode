package com.command.mutton;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Client.java
//  @ Date : 2016/9/29
//  @ Author : 
//
//

public class Client {
    public static void main(String[] args) {
        //开店前准备
        Barbecuer boy = new Barbecuer();
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Waiter waiter = new Waiter();
        //开门营业
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.notify1();

    }
}