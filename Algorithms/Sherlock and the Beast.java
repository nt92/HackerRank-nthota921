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
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            boolean isPossible = false;
            int numFive = 0, numThree = 0;
            while(n > 0)
            {
                if(n % 3 == 0)
                {
                    isPossible = true;
                    numThree += n / 3;
                    break;
                }
                else
                {
                    if(n % 5 == 0)
                        isPossible = true;    
                    numFive++;
                    n -= 5;
                }
            }
            
            if(isPossible)
            {    
                StringBuilder out = new StringBuilder(numThree * 3 + numFive *5);
                for(int i = 0; i < numThree; i++)
                    out.append("555");
                for(int i = 0; i < numFive; i++)
                    out.append("33333");
                System.out.println(out);
            }
            else
                System.out.println("-1");
        }
    }
}