package com.Lab3.Items;

import com.Lab3.Heroes.Hero;

public class Basket extends Item{
    private String[] ItemsIn = new String[5];


    public Basket (String name){
        super(name);
        output.messageOutput(String.format("Создан предмет: %s. \n ", name));
    }

    public void InBasket(){
        for(int i = 0; i<ItemsIn.length; i++){
            boolean isEmpty = true;
            if (this.ItemsIn[i] != null) {
                output.messageOutput("В корзине лежит: " + this.ItemsIn[i]);
                isEmpty=false;
            }
            if(isEmpty){
                output.messageOutput("Корзина пуста");
            }
        }
    }

    public void addToBasket(Item item){
        for(int i = 0; i<ItemsIn.length; i++){
            boolean isFull = true;
            if (this.ItemsIn[i] == null) {
                this.ItemsIn[i] = item.getName();
                output.messageOutput(String.format("Друзья положили в корзину %s ." ,item));
                break;
            }
            if(isFull){
                output.messageOutput("Корзина переполнена.");
            }
        }
    }

    public void takeBasket(Hero hero){
        output.messageOutput(String.format("%s взял %s",hero.getName(),this.getName()));
    };

    @Override
    public String toString(){
        return String.format("Объект типа: Basket. Название: %s. Размер: 5.", this.getName());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 3;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Basket)) return false;

        Basket obj2 = (Basket) obj1;
        return (obj2.getName() == this.getName());
    }
}
