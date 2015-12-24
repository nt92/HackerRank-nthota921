import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int t_i = 0; t_i < t; t_i++)
        {
            int n = in.nextInt();
            int in1 = in.nextInt();
            int in2 = in.nextInt();
            int a = in1, b = in2;
            
            if(in1 > in2)
            {
                a = in2;
                b = in1;
            } 
            
            if(a == b)
            {
                System.out.print(a * (n - 1));
            }
            else
            {
                for(int i = n - 1; i >= 0; i--)
                {
                    System.out.print((a * i) + ((n - i - 1) * b));
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}