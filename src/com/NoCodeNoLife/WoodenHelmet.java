package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:木质头盔
 */
public class WoodenHelmet extends Helmet implements TakeEffect {

    private Integer addMaxHp;

    public WoodenHelmet(String name, Integer value, Integer number, Quality quality) {
        super(name, value, number, quality);
        addMaxHp = 15;
    }

    @Override
    public void effectTo(Creature creature) {

    }
}
