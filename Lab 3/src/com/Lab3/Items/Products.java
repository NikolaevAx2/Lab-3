package com.Lab3.Items;

public class Products extends Item {
    private final int price;

    public Products(String name, int price){
        super(name);
        this.price=price;
        output.messageOutput(String.format("Создан предмет: %s. С ценой: %d \n ", name,price));
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Products. Название: %s. Цена: %d.", this.getName(),this.getPrice());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 4;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Products)) return false;
        Products obj2 = (Products) obj1;
        return (obj2.getName() == this.getName());
    }

}
