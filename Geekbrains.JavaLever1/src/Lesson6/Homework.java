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
public class Homework {
    public static void main(String[] args){
        Animal[] animals = new Animal[4];
        
        animals[0] = new Cat("murzik", 4, 3 ,4);
        animals[1] = new Cat("bursik");
        animals[2] = new Cat("Rex");
        animals[3] = new Cat("bobik", 4, 4, 4);
        
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.run(4);
            animal.swim(4);
            animal.jump(4);   
        }
    }
}
