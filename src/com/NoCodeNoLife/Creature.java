package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:生物
 */
public abstract class Creature {

    private Attributes attributes;// 属性

    private Inventory inventory;// 物品栏

    public Creature() {
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "attributes=" + attributes +
                ", inventory=" + inventory +
                '}';
    }
}
