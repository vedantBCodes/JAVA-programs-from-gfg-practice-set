/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.gfgprcaticeset;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a character:");
        Scanner obj=new Scanner(System.in);
        char ch1=obj.next().charAt(0);
        switch(ch1)
        {
            case'a':case'e':case'i':case'o':case'u':
            case'A':case'E':case'I':case'O':case'U':
            {
                System.out.println(ch1+" is a vowel");
                break;
            }
            default:
                System.out.println(ch1+" is a consonant");
        }
        System.out.print("Enter another character:");
        char ch2=obj.next().charAt(0);
        switch(ch2)
        {
            case'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                System.out.println(ch2+" is a vowel");
            }
            default -> System.out.println(ch2+" is a consonant");
        }
    }
    
}
