/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("John", 25, "Omnivore", "Yes", "Writing books", "Speaking languages");
        System.out.println("Human Name: " + human.getName());
        System.out.println("Human Age: " + human.getAge());
        System.out.println("Mode of Nutrition: " + human.getModeOfNutrition());
        System.out.println("Ability to Write: " + human.getWriting());
        System.out.println("Ability to Talk: " + human.getTalking());
    }
}

