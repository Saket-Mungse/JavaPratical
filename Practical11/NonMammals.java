/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class NonMammals extends LivingBeing{
    String givesEggs;
    
    NonMammals(String name,int age,String modeOfNutrition,String givesEggs){
        super(name,age,modeOfNutrition);
        this.givesEggs = givesEggs;
    }

    public String getGivesEggs() {
        return givesEggs;
    }

    public void setGivesEggs(String givesEggs) {
        this.givesEggs = givesEggs;
    }
    
 
}
