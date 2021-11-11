package com.NoCodeNoLife.Creature;

import com.NoCodeNoLife.Item.Item;

import java.util.LinkedList;

/**
 * ProjectName: Crazy-Adventure
 * Name: People
 * User: Administrator
 * Data: Created in 2021/11/10
 * Description:
 */
public class People extends Creature {

    private Item headArmor;
    private Item legArmor;
    private Item breastplate;
    private Item legguard;
    private Item amulet1;
    private Item amulet2;

    private LinkedList<Item> inventory;

    private Item leftHand;
    private Item rightHand;

    public People(String name, Integer lv, Integer maxHp, Integer hp, Integer atk, Integer def, Item headArmor, Item legArmor, Item breastplate, Item legguard, Item amulet1, Item amulet2, LinkedList<Item> inventory, Item leftHand, Item rightHand) {
        super(name, lv, maxHp, hp, atk, def);
        this.headArmor = headArmor;
        this.legArmor = legArmor;
        this.breastplate = breastplate;
        this.legguard = legguard;
        this.amulet1 = amulet1;
        this.amulet2 = amulet2;
        this.inventory = inventory;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void attackTo(Creature creature) {
        if (creature.getDef() < getAtk()) {
            creature.decreaseHp(getAtk() - creature.getDef());
        }
    }
}
