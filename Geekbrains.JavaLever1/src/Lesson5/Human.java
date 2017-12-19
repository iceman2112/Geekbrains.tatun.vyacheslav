/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author Slava
 */
public class Human {
    protected String name;
    protected int age;
    
    public Human(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    
    public int getAge() {
        return age;
    }
}
