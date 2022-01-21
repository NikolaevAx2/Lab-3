package com.Lab3.Locations;

public class Van extends Location{
    private VanType type;

    public  Van (String name,VanType type){
        super(name);
        this.type=type;
        output.messageOutput(String.format("Создана локация: %s. Тип: %s\n ",name, type));
    }
    public String getType(){
        return this.type.getTranslation();
    }
    @Override
    public String toString(){
        return String.format("Объект типа: Van. Имя: %s.", this.getName());
    }
    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 8;
    }
    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Van)) return false;
        Van obj2 = (Van) obj1;
        return (obj2.getName() == this.getName());
    }
    @Override
    public void description() {
        output.messageOutput(String.format("Уступите бабушке место - доносилось из %s", this.getName()));
    }

}
