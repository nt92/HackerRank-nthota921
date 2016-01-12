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
        for(int test = 0; test < t; test++)
        {
            int num = in.nextInt();
            StringBuilder out = new StringBuilder();
            while(num > 0)
            {
                out.append(num%2);
                num/=2;
            }
            System.out.println(out.reverse());
        }
    }
}