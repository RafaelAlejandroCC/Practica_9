/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_9;

/**
 *
 * @author Rafael Alejandro
 */
public class Staff extends Person{

    
    public Staff(){
        this.school = "FCFM";
        this.pay = 0;
    }
    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    
    private String school;
    private double pay;
    
}
