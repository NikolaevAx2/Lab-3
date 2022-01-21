package com.Lab3.Locations;

public class Home extends Location{
    public Home(String name){
        super(name);
        output.messageOutput(String.format("Создана локация: %s. \n ",name));
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Home. Имя: %s.", this.getName());
    }
    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 9;
    }
    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Home)) return false;
        Home obj2 = (Home) obj1;
        return (obj2.getName() == this.getName());
    }
    @Override
    public void description() {
        output.messageOutput(String.format("Дом, милый дом"));
    }
}
