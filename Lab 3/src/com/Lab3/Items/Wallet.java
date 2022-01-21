package com.Lab3.Items;

import com.Lab3.BuyItem;

public class Wallet extends Item implements BuyItem {

    private int cash;
    WalletType type;

    public Wallet(String name, int cash,WalletType type){
        super(name);
        this.cash=cash;
        this.type= type;
        output.messageOutput(String.format("Создан предмет: %s. Внутри %d монет. Цвет: %s. \n ", name,cash,type));
    }

    public int setCash(int cash){
        return this.cash=cash;
    }
    public int getCash(){
        return this.cash;
    }

    public void BuyItem(Item item, Basket basket){
        if (item.getPrice()-this.getCash()>=0){
            this.setCash(this.getCash()-item.getPrice());
            output.messageOutput(String.format("Друзья купили %s за %d монет. \n ",item.getName(),this.getCash()-item.getPrice()));
            basket.addToBasket(item);
        }
    }

    public void BuyItem(Item item){
        if (item.getPrice()-this.getCash()>=0){
            this.setCash(this.getCash()-item.getPrice());
            output.messageOutput(String.format("Друзья купили %s за %d монет. \n ",item.getName(),this.getCash()-item.getPrice()));
        }
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Wallet. Название: %s. Содержит: %d монет.", this.getName(),this.getPrice());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 10;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Wallet)) return false;
        Wallet obj2 = (Wallet) obj1;
        return (obj2.getName() == this.getName());
    }
}
