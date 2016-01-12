import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        int gcd = find_gcd(a, b);
        System.out.println(gcd);
    }
    
    static  int find_gcd(int a,int b)
    {
        if(a == b)
            return a;
  