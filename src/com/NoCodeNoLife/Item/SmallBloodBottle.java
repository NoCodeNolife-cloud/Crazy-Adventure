package com.NoCodeNoLife.Item;

import com.NoCodeNoLife.Creature.Creature;

/**
 * ProjectName: Crazy-Adventure
 * Name: SmallBloodBottle
 * User: Administrator
 * Data: Created in 2021/11/10
 * Description:
 */
public class SmallBloodBottle extends Item {

    public SmallBloodBottle() {
        super("小血瓶", 10, "可治疗25点血量");
    }

    public void affects(Creature creature) {
        creature.increaseHp(25);
    }
}
