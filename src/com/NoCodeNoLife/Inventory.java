package com.NoCodeNoLife;

import java.util.LinkedList;

/**
 * Data: Created in 2021/11/13
 * Description:物品栏
 */
public class Inventory {

    LinkedList<Item> linkedList;// 物品栏

    public Inventory(LinkedList<Item> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList<Item> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Item> linkedList) {
        this.linkedList = linkedList;
    }

    public void addItem(Item item){
        linkedList.add(item);
    }

    public void removeItem(Item item){
        linkedList.remove(item);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "linkedList=" + linkedList +
                '}';
    }
}
