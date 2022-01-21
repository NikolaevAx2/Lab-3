package com.Lab3.Heroes;

import com.Lab3.Items.Item;
import com.Lab3.Items.Wallet;
import com.Lab3.Locations.Location;

public class Fish extends Hero {

    private int cash;
    private String [] Items ;

    public Fish (String name, Location location){
        super(name, location);
        output.messageOutput(String.format("Создан персонаж: %s. \n ",name));
    }

    public Fish (String name, Location location,int cash){
        super(name, location);
        this.cash= cash;
        output.messageOutput(String.format("Создан персонаж: %s. Денег в кармане: %d монет. \n ", name,cash));
    }

    public int getCash(){
        return this.cash;
    }

    public int setCash(int cash){
        return  this.cash=cash;
    }

    public void allMoneyToWallet(Wallet wallet){
        output.messageOutput(String.format("%s добавил в кошелек %d монет.", this.getName(),this.getCash()));
        wallet.setCash(wallet.getCash()+this.getCash());
        this.setCash(0);
    }


    @Override
    public void changeLocation(Location location) {

        output.messageOutput(String.format("%s отправляется из '%s'.", this.getName(), this.getLocation().getName()));
        output.messageOutput(String.format("%s плывет... идет... плывет...", this.getName()));
        output.messageOutput(String.format("%s пришел в '%s'!\n", this.getName(), location.getName()));
        this.setLocation(location);

    }

    @Override
    public String toString(){
        return String.format("Объект типа: Fish. Имя: %s. Локация: %s.", this.getName(), this.getLocation());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 1;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Fish)) return false;
        Fish obj2 = (Fish) obj1;
        return (obj2.getName() == this.getName());
    }




}
