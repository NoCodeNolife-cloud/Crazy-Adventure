package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:抗性
 */
public class Resistance {

    private Integer fire;
    private Integer ice;
    private Integer thunder;
    private Integer poison;
    private Integer curse;

    public Resistance(Integer fire, Integer ice, Integer thunder, Integer poison, Integer curse) {
        this.fire = fire;
        this.ice = ice;
        this.thunder = thunder;
        this.poison = poison;
        this.curse = curse;
    }

    public Integer getFireDamageRate() {
        return fire - 100;
    }

    public Integer getIceDamageRate() {
        return ice - 100;
    }

    public Integer getThunderDamageRate() {
        return thunder - 100;
    }

    public Integer getPoisonDamageRate() {
        return poison - 100;
    }

    public Integer getCurseDamageRate() {
        return curse - 100;
    }
}
