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
            String nString = "" + n;
            int nLength = nString.length();
            int numOut = 0, tempN = n;
            for(int i = 0; i < nLength; i++)
            {
                int num = tempN % 10;
                tempN /= 10;
                if(num > 0 && n % num == 0)
                    numOut++;
            }
            System.out.println(numOut);
        }
    }
}