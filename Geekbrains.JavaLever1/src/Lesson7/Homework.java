/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import java.util.Random;

/**
 *
 * @author Slava
 */
public class Homework {
    public static void main(String[] args) {
        Plate plate = new Plate(25);
    
        Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++){
            Random random = new Random();
            cats[i] = new Cat("Cat" + i, random.nextInt(20));
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + ((cats[i].isSatiety()) ? " сыт" : " голоден"));
        }   
    }
}
