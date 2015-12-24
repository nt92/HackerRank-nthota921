import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
        
            long total = 0;
        
            if(z + x >= y && z + y >= x)
                total = b * x + w * y;
            else if(x > y + z)
                total = w * y + b * (y + z); 
            else if(y > x + z)
                total = b * x + w * (x + z);

            System.out.println(total);
        }
    }
}