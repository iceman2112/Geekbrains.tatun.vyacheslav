/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

import static java.lang.String.format;

/**
 *
 * @author Slava
 */
public abstract class Animal {
 
    protected String name;
    
    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;
            
    public Animal(String name) {
        this.name = name;
    
        maxRun = 0;
        maxSwim = 0;
        maxJump = 0;
    }   

    public Animal(String name, int maxRun, int maxSwim, int maxJump) {
        this(name);
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }
  
    public void run(int value) {
        System.out.println("run:" + (value <= maxRun));
    }
    
    public void swim(int value){
        System.out.println("swim:" + (value <= maxSwim));
    }
    
    public void jump(int value){
        System.out.println("jump:" + (value <= maxJump));
    }

    @Override
    public String toString() {
        return format("name %s, run %d, swim %d, jump %d", name, maxRun, maxSwim, maxJump);
    }  
}
