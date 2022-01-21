package com.Lab3.Heroes;

import com.Lab3.Items.*;
import com.Lab3.Locations.Location;
import com.Lab3.Locations.Van;

public class Ponchik extends Hero{

    public Ponchik (String name, Location location){
        super(name, location);
    }

    public void checkBasket(Basket basket){
        output.messageOutput(String.format("%s решил проверить корзину", this.getName()));
        basket.InBasket();
    }

    public void bye(){
        output.messageOutput(String.format("Прощайте, вымышленные друзья - сказал %s", this.getName()));
    }

    public void findPlace(Van van){
        double chance;
        do {
            chance = Math.random();
            output.messageOutput(String.format("%s: Ой простите бабушка, я вас не заметил", this.getName()));
        } while (chance <= 0.5);
        output.messageOutput(String.format("%s занял место в %s вагоне.", this.getName(),van.getType()));
    }

    public void watchAround(){
        output.messageOutput(String.format("%s разгладывал оркужение и пытался найти в нем что-то прекрасное, но его окружали бабушки, едущие на огород с рассадой.",this.getName()));
    }

    @Override
    public void changeLocation(Location location) {

        output.messageOutput(String.format("%s отправляется из '%s'.", this.getName(), this.getLocation().getName()));
        output.messageOutput(String.format("%s идет... катится... идет...", this.getName()));
        output.messageOutput(String.format("%s пришел в '%s'!\n", this.getName(), location.getName()));
        this.setLocation(location);

    }

    @Override
    public String toString(){
        return String.format("Объект типа: Ponchik. Имя: %s. Локация: %s.", this.getName(), this.getLocation());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 2;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Ponchik)) return false;
        Ponchik obj2 = (Ponchik) obj1;
        return (obj2.getName() == this.getName());
    }
}
