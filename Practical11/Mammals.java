/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
class Mammals extends LivingBeing {
    String directBirth;
    
    public Mammals(String name,int age,String modeOfNutrition,String directBirth){
        super(name,age,modeOfNutrition);
        this.directBirth = directBirth;
    }

    public String getDirectBirth() {
        return directBirth;
    }

    public void setDirectBirth(String directBirth) {
        this.directBirth = directBirth;
    }
    
    
    
}
