package com.Lab3.Items;

public enum WalletType {
    RED("Красный"),
    WHITE("Белый"),
    BLACK("Черный"),
    BLUE("Голубой");

    private final String translation;

    WalletType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }
}
