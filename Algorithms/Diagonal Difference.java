import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int sumFirst = 0, sumSecond = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                temp = in.nextInt();
                if(i == j)
                    sumFirst += temp;
                if(i + j == n - 1)
                    sumSecond += temp;
            }
        }
        System.out.println(Math.abs(sumFirst - sumSecond));
    }
}