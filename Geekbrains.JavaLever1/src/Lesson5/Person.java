/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import static java.lang.String.format;

/**
 *
 * @author Slava
 */
public class Person extends Human{
    private String email;
    private String telephone;
    private int salary;
    
    public Person(String name, int age, String telephone, String email, int salary) {
        super(name, age);
        this.telephone = telephone;
        this.email = email;
        this.salary = salary;
    }
    
    @Override 
    public String toString() {
        return format("Имя: %s, Возраст: %d, Телефон: %s, Эл. почта: %s, Зарплата: %d",
                name, age, telephone, email, salary);      
    }
}
