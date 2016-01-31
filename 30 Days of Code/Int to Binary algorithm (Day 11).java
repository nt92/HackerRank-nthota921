import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        int[] arr = [1, 4, 9, 2, 3, 10, 14, 5, 6];
        boolean swapped =  true;
        int i = 0, temp;
        while(swapped)
        {
        	swapped = false;
        	i++;
        	for(int j = 0; j < arr.length - i; j++)
        	{
        		if(arr[j] > arr[j+1])
        		{
        			temp = arr[j];
        			arr[j] = arr[j+1];
        			i++;
        			swapped = true;
        		}
        	}
        }

        for(int i = 0; i < arr.length; i++)
        {
        	System.out.print(arr[i] + " ");
        }
    }
}