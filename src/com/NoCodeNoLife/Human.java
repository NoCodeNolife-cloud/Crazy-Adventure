package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:
 */
public class Human extends Creature {

    private EquipmentBar equipmentBar;// 装备栏

    public Human() {
    }

    public EquipmentBar getEquipmentBar() {
        return equipmentBar;
    }

    public void setEquipmentBar(EquipmentBar equipmentBar) {
        this.equipmentBar = equipmentBar;
    }

    @Override
    public String toString() {
        return "Human{" +
                "equipmentBar=" + equipmentBar +
                "} " + super.toString();
    }
}
