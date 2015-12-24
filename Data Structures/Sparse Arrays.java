import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int numStr = in.nextInt();
        String[] strArray = new String[numStr];
        
        for(int i = 0; i < numStr; i++)
        {
            strArray[i] = in.next();
        }
        
        int numComp = in.nextInt();
        
        for(int i = 0; i < numComp; i++)
        {
            int temp = 0;
            String comp = in.next();
            for(int j = 0; j < numStr; j++)
            {
                if(comp.equals(strArray[j]))
                   temp++;
            }
            System.out.println(temp);
        }
    }
}