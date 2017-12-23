/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author Slava
 */
public class Dog extends Animal{    
    public Dog(String name) {
        super(name);
        
        this.maxJump = 5;
        this.maxRun  = 5;
        this.maxSwim = 5;
    }  

    public Dog(String name, int maxRun, int maxSwim, int maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }
}
