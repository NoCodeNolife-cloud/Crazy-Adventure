package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:装备
 */
public abstract class Equipment extends Item {

    public Equipment(String name, Integer value, Integer number, Quality quality) {
        super(name, value, number, quality);
    }
}
