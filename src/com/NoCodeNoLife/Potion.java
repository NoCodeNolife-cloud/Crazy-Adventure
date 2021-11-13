package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:药水
 */
public abstract class Potion extends Item {

    private Integer rounds;// 回合数

    public Potion(String name, Integer value, Integer number, Quality quality, Integer rounds) {
        super(name, value, number, quality);
        this.rounds = rounds;
    }

    public void decreaseRounds() {
        --rounds;
    }
}
