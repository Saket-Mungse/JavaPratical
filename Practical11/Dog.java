/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Dog extends Animal{
    boolean loyalty;
    
    Dog(String name,int age,String modeOfNutrition,String directBirth,boolean hunting,boolean loyalty){
        super(name,age,modeOfNutrition,directBirth,hunting);
        this.loyalty = loyalty;
        
    }

    public boolean isLoyal() {
        return loyalty;
    }

    public void setLoyality(boolean loyalty) {
        this.loyalty = loyalty;
    }
    
    
}
