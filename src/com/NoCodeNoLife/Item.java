package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:物品
 */
public abstract class Item {

    private String name;// 名称
    private Integer value;// 价值
    private Integer number;// 数量
    private Quality quality;// 品质

    public Item(String name, Integer value, Integer number, Quality quality) {
        this.name = name;
        this.value = value;
        this.number = number;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", number=" + number +
                ", quality=" + quality +
                '}';
    }
}
