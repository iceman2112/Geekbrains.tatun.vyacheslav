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
public class Cat extends Animal{   
    public Cat(String name) {
        super(name);
        this.maxJump = 3;
        this.maxRun = 3;
        this.maxSwim = 0;
    }

    public Cat(String name, int maxRun, int maxSwim, int maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }
}
