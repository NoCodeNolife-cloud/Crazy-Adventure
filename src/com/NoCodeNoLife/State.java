package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:
 */
public abstract class State {

    private Integer rounds;// 持续时间

    public void decreaseRounds() {
        --rounds;
    }
}
