import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numTest = in.nextInt();
        int numStudents, numCancel, numPresent;
        for(int i = 0; i < numTest; i++)
        {
            numStudents = in.nextInt();
            numCancel = in.nextInt();
            numPresent = 0;
            for(int j = 0; j < numStudents; j++)
            {
                if(in.nextInt() <= 0)
                    numPresent++;
            }
            if(numPresent < numCancel)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}