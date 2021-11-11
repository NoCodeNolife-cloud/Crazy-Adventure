package com.NoCodeNoLife.Creature;

/**
 * ProjectName: Crazy-Adventure
 * Name: Character
 * User: Administrator
 * Data: Created in 2021/11/10
 * Description:
 */
public abstract class Creature {

    private String name;
    private Integer lv;
    private Integer maxHp;
    private Integer hp;
    private Integer atk;
    private Integer def;
    private Boolean alive;

    public Creature(String name, Integer lv, Integer maxHp, Integer hp, Integer atk, Integer def) {
        this.name = name;
        this.lv = lv;
        this.maxHp = maxHp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        // default
        alive = true;
        checkIsAlive();
    }

    public void decreaseHp(Integer hp) {
        this.hp -= hp;
        checkIsAlive();
    }

    public void increaseHp(Integer hp) {
        this.hp += hp;
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    public Boolean isAlive() {
        return alive;
    }

    public void checkIsAlive() {
        if (hp <= 0) {
            die();
        }
    }

    private void die() {
        alive = false;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", lv=" + lv +
                ", maxHp=" + maxHp +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", alive=" + alive +
                '}';
    }
}
