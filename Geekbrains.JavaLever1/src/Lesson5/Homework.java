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
public class Homework {
    public static void main(String[] agrs) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Иванов Иван", 20, "20-45-22", "i@google.com", 70000);
        persons[1] = new Person("Сидоров Иван", 40, "30-45-22", "i2@google.com", 80000);
        persons[2] = new Person("Краснов Иван", 56, "40-45-22", "i3@google.com", 70000);
        persons[3] = new Person("Суслин Иван",  60, "50-45-22", "i4@google.com", 170000);
        persons[4] = new Person("Сулапаров Андрей", 33, "60-45-22", "i4@google.com", 70000);
        
        printPerson(persons, 40);
    }
    
    public static void printPerson(Person[] persons, int age) {
        for (int i = 0; i < persons.length; ++i) {
            if (persons[i].getAge() > age) 
                System.out.println(persons[i]);
        }
    }
}
