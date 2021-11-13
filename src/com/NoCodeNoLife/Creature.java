package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:生物
 */
public abstract class Creature {

    private Attributes attributes;// 属性

    private EquipmentBar equipmentBar;// 装备栏

    private Inventory inventory;// 物品栏

    public Creature(Attributes attributes, EquipmentBar equipmentBar, Inventory inventory) {
        this.attributes = attributes;
        this.equipmentBar = equipmentBar;
        this.inventory = inventory;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public EquipmentBar getEquipmentBar() {
        return equipmentBar;
    }

    public void setEquipmentBar(EquipmentBar equipmentBar) {
        this.equipmentBar = equipmentBar;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
