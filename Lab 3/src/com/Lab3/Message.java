package com.Lab3;

public class Message implements MessageOutput{
    @Override
    public void messageOutput(String message){
        System.out.println(message);
    }
}
