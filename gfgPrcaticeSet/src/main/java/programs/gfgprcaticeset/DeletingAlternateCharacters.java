package programs.gfgprcaticeset;
//Given a string str as input. Delete the characters at odd indices of the string.

import java.util.Scanner; 

public class DeletingAlternateCharacters {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String str2=" ";
        int j=0;
        for(int i=0;i<str.length();i=i+2)
        {
            str2=str2+str.charAt(i);
            j++;
        }   
        System.out.println("Modified string:"+str2);           
      
    } 
}
