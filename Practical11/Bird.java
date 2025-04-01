/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Bird extends NonMammals{
    
    boolean flying;
    
    Bird(String name,int age,String modeOfNutrition,String givesEggs,boolean flying){
        super(name,age,modeOfNutrition,givesEggs);
        this.flying = flying;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
    
    
    
}
