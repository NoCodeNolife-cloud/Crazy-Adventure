package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/13
 * Description:
 */
public class Condition {

    private Boolean alive;// 存活
    private Boolean action;// 活动

    public Condition(Boolean alive, Boolean action) {
        this.alive = alive;
        this.action = action;
    }

    public Boolean isAlive() {
        return alive;
    }

    public void resurrection(){
        alive=true;
    }

    public void dead(){
        alive=false;
    }

    public Boolean isAction() {
        return action;
    }

    public void canNotAction() {
        action=false;
    }

    public void canAction(){
        action=true;
    }
}
