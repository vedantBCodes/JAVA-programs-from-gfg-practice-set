//Given an array arr[] of size "size" and a size of subarray equals to 3.
//Find the maximum for each and every contiguous subarray of size 3.
package programs.gfgprcaticeset;

import static java.lang.System.exit;
import java.util.Scanner;
public class MaximumOfAllSubarrays {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=obj.nextByte();
        int arr[]=new int[size];
        System.out.print("Enter any "+size+" numbers:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        int x=3;
       int max;
        System.out.print("Maximum numbers in a contigous subarrays of size 3 are:");
        for(int i=0;i<size;i++)
        {
            max=arr[i];
            for(int j=i;j<=(x-1);j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
            if(x==(size))
            {
                exit(0);
            }
            x++;
        }
    }
    
}
