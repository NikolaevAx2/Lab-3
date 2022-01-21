package com.Lab3.Locations;

public enum VanType {
    VIP("Премиум"),
    RESTOURAN("Ресторан"),
    EMPTY("Пустой"),
    FULL("Полный");

    private final String translation;

    VanType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }
}
