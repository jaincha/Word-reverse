/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordreverse;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class WordReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String word = in.next();
        
        char[] reverse = new char[word.length()];
        
        for(int i = 0; i < word.length(); i++){
            reverse[i] = word.charAt(i);
        }
        for(int i = reverse.length - 1; i >= 0; i--){
            System.out.print(reverse[i]);
        }
        
       System.out.println("This is the modified version");
       System.out.println("Hello world!!");
        System.out.println("hello!!!");
       
    }
    
}
