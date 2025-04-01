/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Animal extends Mammals {

    boolean hunting;
    
    Animal(String name,int age,String modeOfNutrition,String directBirth,boolean hunting){
        super(name,age,modeOfNutrition,directBirth);
        this.hunting = hunting;
    }

    public boolean isHunting() {
        return hunting;
    }

    public void setHunting(boolean hunting) {
        this.hunting = hunting;
    }


    
    
}
