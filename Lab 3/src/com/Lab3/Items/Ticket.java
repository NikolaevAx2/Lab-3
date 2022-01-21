package com.Lab3.Items;

public class Ticket extends Item{
    private final String trainTo;
    private final int price;

    public Ticket(String name, int price,String trainTo){
        super(name);
        this.price=price;
        this.trainTo= trainTo;
        output.messageOutput(String.format("Создан предмет: %s. С ценой: %d монет. Направление: %s. \n ", name,price,trainTo));
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Ticket. Название: %s. Цена: %d.", this.getName(),this.getPrice());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 5;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Ticket)) return false;
        Ticket obj2 = (Ticket) obj1;
        return (obj2.getName() == this.getName());
    }
}
