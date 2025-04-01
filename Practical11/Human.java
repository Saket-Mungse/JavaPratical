/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Human extends Mammals{
    
   String writing;
   String talking;
  
   Human(String name,int age,String modeOfNutrition,String directBirth,String writing,String talking){
       super(name,age,modeOfNutrition,directBirth);
       this.writing = writing;
       this.talking = talking;
   }

    public String getWriting() {
        return writing;
    }

    public String getTalking() {
        return talking;
    }

    public void setWriting(String writing) {
        this.writing = writing;
    }

    public void setTalking(String talking) {
        this.talking = talking;
    }
   
   
    
}
