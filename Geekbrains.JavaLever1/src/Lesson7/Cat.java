/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author Slava
 */
public class Cat {
    private String name;

    public String getName() {
        return name;
    }
    private int appetite;
    private boolean satiety = false;

    public boolean isSatiety() {
        return satiety;
    }
    
    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite; 
    }
    
    public boolean eat(CanFeed feed){
        if (feed.decreaseFood(appetite)) { 
            satiety = true;
        }
        return satiety; 
    }
}
