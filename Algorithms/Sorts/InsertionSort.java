import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    //Sorting for moving end element into array
    public static void insertIntoSorted(int[] ar) 
    {
        for(int i = ar.length - 1; i >= 0; i--)
        {
            int temp = ar[i];
            int j = i;
            while (j > 0 && ar[j-1] > temp)
            {
                ar[j] = ar[j-1];
                j--;
                printArray(ar);
            }
            ar[j] = temp;
        }
        printArray(ar);
    }

    //Sorts a whole array
    public static void insertionSortPart2(int[] ar)
    {
        for(int i = 1; i < ar.length; i++)
        {
            int temp = ar[i];
            int j = i;
            while(j > 0 && ar[j-1] > temp)
            {
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = temp;
            printArray(ar);
        }
    }  
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++)
            ar[i]=in.nextInt(); 
         
         insertIntoSorted(ar);
    }
    
    private static void printArray(int[] ar) 
    {
      for(int n: ar)
         System.out.print(n+" ");
      
        System.out.println("");
   }
}