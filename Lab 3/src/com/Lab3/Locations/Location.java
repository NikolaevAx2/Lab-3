package com.Lab3.Locations;

import com.Lab3.Message;
import com.Lab3.MessageOutput;

public abstract class Location {
    private final String name;
    MessageOutput output = new Message();

    public Location (String name) {
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public abstract void description();
}
