package com.command.mutton;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : BakeMuttonCommand.java
//  @ Date : 2016/9/29
//  @ Author : 
//
//

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    public void excuteCommand() {
        receiver.bakeMutton();;
    }
}