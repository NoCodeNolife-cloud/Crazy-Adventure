package com.NoCodeNoLife.Item;

/**
 * ProjectName: Crazy-Adventure
 * Name: Item
 * User: Administrator
 * Data: Created in 2021/11/10
 * Description:
 */
public abstract class Item {

    private String name;
    private Integer value;
    private String description;

    public Item(String name, Integer value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Integer getValue(){
        return value;
    }
}
