/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text_analyzer;
import java.util.*;

/**
 *
 * @author VICTUS
 */
public class Text_Analyzer {

    /**
     * @param args the command line arguments
     */
    
    private String inputedText;
    private int textLength;
    private int wordCount;
    private int lineCount;
    private int tabCount;
    private int spaceCount;
    private String uniqueCharacters;

    public Text_Analyzer(String inputedText) {
        this.inputedText = inputedText;
        analyze();
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public String getUniqueCharacters() {
        return uniqueCharacters;
    }
    
    public int getCharCount(char selectChar){
        int charCount = 0;
        for(int i=0;i<inputedText.length();i++){
            if(inputedText.charAt(i)==selectChar){
                charCount++;
            }
        }        
        
        return charCount;
    }
    
    public int getWordCount(String selectWord){
        int wordcount = 0;
        String[] wc = inputedText.split("[\n\t\s]");
        for(int i=0;i<wc.length;i++){
            if(!wc[i].isEmpty()&&wc[i].equals(selectWord)){
                wordcount++;
            }
        }        
        return wordcount;
    }

        
    //will make use of inputedText
    private void analyze(){
        textLength = inputedText.length();
        lineCount = textLength>0?inputedText.split("\n",-1).length:0;
        spaceCount = inputedText.split(" ",-1).length-1;
        tabCount = inputedText.split("\t",-1).length-1;
       
        String[] wc = inputedText.split("[\n\t\s]");
        int count=0;
        for(int i=0;i<wc.length;i++){
            if(!wc[i].isEmpty()){
                count++;
            }
        }
        wordCount = count;
        

        
    }
    
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        new Design().setVisible(true);
    });
    }
    
}
