package com.Lab3.Locations;

public class RailwayStation extends Location{

    public RailwayStation(String name){
        super(name);
        output.messageOutput(String.format("Создана локация: %s. \n ",name));
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Railway Station. Имя: %s.", this.getName());
    }
    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 7;
    }
    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof RailwayStation)) return false;
        RailwayStation obj2 = (RailwayStation) obj1;
        return (obj2.getName() == this.getName());
    }
    @Override
    public void description() {
        output.messageOutput(String.format("Внимаение на первом пути... Хм, похоже на %s", this.getName()));
    }

}
