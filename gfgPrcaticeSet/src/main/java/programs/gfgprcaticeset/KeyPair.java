/*Given an array Arr of N positive integers and another number X.
Determine whether or not there exist two elements in Arr whose sum is exactly X
by giving output yes or no*/
package programs.gfgprcaticeset;

import static java.lang.System.exit;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class KeyPair {
    KeyPair(int arr[],int n,int x){
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=(i+1);j<n;j++)
            {
                if((arr[i]+arr[j])==x)
                {
                    System.out.println("YES");
                    exit(0);
                }
            }
        }
        System.out.println("NO");        
    }   
    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter any "+n+" array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter a number:");
        int x=obj.nextInt();
        KeyPair obj2=new KeyPair(arr,n,x);
}
}
