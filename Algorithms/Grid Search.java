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
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            
            for(int G_i=0; G_i < R; G_i++)
                G[G_i] = in.next();
            
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            
            for(int P_i=0; P_i < r; P_i++)
                P[P_i] = in.next();
            
            int numMatch = 0;
            
            for(int i = 0; i < R - r + 1; i++)
            {
                for(int j = 0; j < C - c + 1; j++)
                {
                    numMatch = 0;
                    if(G[i].substring(j, j + c).equals(P[0]))
                    {
                        numMatch++;
                        for(int k = 1; k < r; k++)
                            if(G[i+k].substring(j, j + c). equals(P[k]))
                                numMatch++;
                            else
                                break;
                    }
                    if(numMatch == r)
                    {
                        System.out.println("YES");
                        break;
                    }
                }
                if(numMatch == r)
                    break;
            }
            
            if(numMatch != r)
                System.out.println("NO");
            
        }
    }
}