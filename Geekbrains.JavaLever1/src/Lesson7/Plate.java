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
public class Plate implements CanFeed{
    public int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    public void addFood(int n) {
        this.food += n;
    }
    
    @Override
    public boolean decreaseFood(int n) {
        if (this.food < n) 
            return false;
        this.food -= n;
        return true;
    }
}
