package com.Lab3.Items;

import com.Lab3.Message;
import com.Lab3.MessageOutput;

public class Item {
    MessageOutput output = new Message();

    private final String name;
    private int price;

    public Item (String name){
        this.name=name;
        output.messageOutput(String.format("Создан предмет: %s. \n ", name,price));
    };
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    };
}
