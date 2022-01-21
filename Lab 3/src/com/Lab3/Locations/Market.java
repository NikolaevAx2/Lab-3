package com.Lab3.Locations;

public class Market extends Location{

    public Market(String name){
        super(name);
        output.messageOutput(String.format("Создана локация: %s. \n ",name));
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Market. Имя: %s.", this.getName());
    }
    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 6;
    }
    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Market)) return false;
        Market obj2 = (Market) obj1;
        return (obj2.getName() == this.getName());
    }
    @Override
    public void description() {
        output.messageOutput(String.format("Запахло свежими булочками... Это же %s", this.getName()));
    }

}
