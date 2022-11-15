/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_9;

/**
 *
 * @author Rafael Alejandro
 */
public class Person {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    private String name;
    private String Address;

    public static void main(String[] args) {
        System.out.println("Estudiantes");
    }
}
