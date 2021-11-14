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

    public Resistance() {
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

    public Integer getFire() {
        return fire;
    }

    public void setFire(Integer fire) {
        this.fire = fire;
    }

    public Integer getIce() {
        return ice;
    }

    public void setIce(Integer ice) {
        this.ice = ice;
    }

    public Integer getThunder() {
        return thunder;
    }

    public void setThunder(Integer thunder) {
        this.thunder = thunder;
    }

    public Integer getPoison() {
        return poison;
    }

    public void setPoison(Integer poison) {
        this.poison = poison;
    }

    public Integer getCurse() {
        return curse;
    }

    public void setCurse(Integer curse) {
        this.curse = curse;
    }

    @Override
    public String toString() {
        return "Resistance{" +
                "fire=" + fire +
                ", ice=" + ice +
                ", thunder=" + thunder +
                ", poison=" + poison +
                ", curse=" + curse +
                '}';
    }
}
