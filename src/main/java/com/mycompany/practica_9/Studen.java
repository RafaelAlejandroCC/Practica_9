/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_9;

/**
 *
 * @author Rafael Alejandro
 */
public class Studen extends Person{
    
    public Studen(){
        this.Program = "Ciencias Computacionales";
        this.Year = 2022;
        this.Fee = 1;
        
    }

    /**
     * @return the Program
     */
    public String getProgram() {
        return Program;
    }

    /**
     * @param Program the Program to set
     */
    public void setProgram(String Program) {
        this.Program = Program;
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the Fee
     */
    public double getFee() {
        return Fee;
    }

    /**
     * @param Fee the Fee to set
     */
    public void setFee(double Fee) {
        this.Fee = Fee;
    }

    
    private String Program;
    private int Year;
    private double Fee;
}
