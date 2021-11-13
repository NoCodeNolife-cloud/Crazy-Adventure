package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:生物属性
 */
public class Attributes {

    private Integer maxHp;// 最大生命值
    private Integer hp;// 生命值
    private Integer lv;// 等级
    private Integer baseAtk;// 基础攻击力
    private Integer baseDef;// 基础防御力

    private Integer dodgeRate;// 闪避率
    private Integer critRate;// 暴击率
    private Integer critMultiplier;// 暴击倍数

    private Integer strength;// 力量
    private Integer agile;// 敏捷
    private Integer wisdom;// 智慧
    private Integer constitution;// 体质

    private Integer theft;// 偷盗
    private Integer trade;// 贸易
    private Integer sneak;// 潜行

    private Resistance resistance;// 抗性

    private Condition condition;// 状态

    public Attributes(Integer maxHp, Integer hp, Integer lv, Integer baseAtk, Integer baseDef, Integer dodgeRate, Integer critRate, Integer critMultiplier, Integer strength, Integer agile, Integer wisdom, Integer constitution, Integer theft, Integer trade, Integer sneak, Resistance resistance) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.lv = lv;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.dodgeRate = dodgeRate;
        this.critRate = critRate;
        this.critMultiplier = critMultiplier;
        this.strength = strength;
        this.agile = agile;
        this.wisdom = wisdom;
        this.constitution = constitution;
        this.theft = theft;
        this.trade = trade;
        this.sneak = sneak;
        this.resistance = resistance;
        // condition=new Condition()
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public void increaseHp(Integer hp) {
        this.hp += hp;
        if (this.hp > maxHp) {
            this.hp = maxHp;
        }
    }

    public void decreaseHp(Integer hp) {
        this.hp -= hp;
        if (this.hp < 0) {
            condition.dead();
        }
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(Integer baseAtk) {
        this.baseAtk = baseAtk;
    }

    public Integer getBaseDef() {
        return baseDef;
    }

    public void setBaseDef(Integer baseDef) {
        this.baseDef = baseDef;
    }

    public Integer getDodgeRate() {
        return dodgeRate;
    }

    public void setDodgeRate(Integer dodgeRate) {
        this.dodgeRate = dodgeRate;
    }

    public Integer getCritRate() {
        return critRate;
    }

    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    public Integer getCritMultiplier() {
        return critMultiplier;
    }

    public void setCritMultiplier(Integer critMultiplier) {
        this.critMultiplier = critMultiplier;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAgile() {
        return agile;
    }

    public void setAgile(Integer agile) {
        this.agile = agile;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getTheft() {
        return theft;
    }

    public void setTheft(Integer theft) {
        this.theft = theft;
    }

    public Integer getTrade() {
        return trade;
    }

    public void setTrade(Integer trade) {
        this.trade = trade;
    }

    public Integer getSneak() {
        return sneak;
    }

    public void setSneak(Integer sneak) {
        this.sneak = sneak;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
