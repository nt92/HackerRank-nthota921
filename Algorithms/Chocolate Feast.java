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
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int numChoc = n/c;
            int numWrapper = n/c;
            while(numWrapper > 0)
            {
                int temp = numWrapper / m;
                numChoc += temp;
                numWrapper = numWrapper % m;
                numWrapper += temp;
                if(numWrapper < m)
                    break;
            }
            System.out.println(numChoc);
        }
    }
}