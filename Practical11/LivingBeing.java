/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */

public class LivingBeing {
    String name;
    int age;
    String modeOfNutrition;

    public LivingBeing(String name, int age, String modeOfNutrition){
        this.name = name;
        this.age = age;
        this.modeOfNutrition = modeOfNutrition;
    }

    public void setName(String name){ 
        this.name = name; 
    }
    public void setAge(int age){ 
        this.age = age; 
    }
    public void setModeOfNutrition(String modeOfNutrition){ 
        this.modeOfNutrition = modeOfNutrition; 
    }

    public String getName(){ 
        return name; 
    }
    public int getAge(){ 
        return age; 
    }
    public String getModeOfNutrition(){ 
        return modeOfNutrition; 
    }
}
