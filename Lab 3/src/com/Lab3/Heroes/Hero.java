package com.Lab3.Heroes;
import com.Lab3.Message;
import com.Lab3.Locations.*;
import com.Lab3.MessageOutput;

public abstract class Hero {
    private final String name;
    private Location location;

    MessageOutput output = new Message();
    public Hero (String name, Location location){
        this.name = name;
        this.location= location;
    }

    public String getName (){
        return this.name;
    }

    public Location getLocation(){
        return this.location;
    }

    public Location setLocation(Location location){
        return this.location=location;
    }

    public abstract void changeLocation(Location location);
}
