package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:
 */
public class SmallMedicineBottle extends Potion implements TakeEffect {

    private Integer addHpRate;

    public SmallMedicineBottle(String name, Integer value, Integer number, Quality quality, Integer rounds) {
        super(name, value, number, quality, rounds);
        addHpRate = 10;
    }

    @Override
    public void effectTo(Creature creature) {

    }
}
