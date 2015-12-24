import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        String[] hourList = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",     "eleven", "twelve", "one"};
        
        String[] numList = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",     "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen" , "seventeen" , "eighteen" , "nineteen" , "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        
        int tensPlace = m / 10;
        int onesPlace = m % 10;
        
        if(m == 30)
            System.out.println("half past " + hourList[h]);
        else if(m < 30)
        {
            if(m == 0)
                System.out.println(numList[h] + " o' clock");
            else if(m == 15)
                System.out.println("quarter past " + hourList[h]);
            else
                System.out.println(numList[m] + " minutes past " + hourList[h]) ; 
        }
        else if(m > 30)
        {
            if(m == 45)
                System.out.println("quarter to " + hourList[h+1]);
            else
                System.out.println(numList[60-m] + " minutes to " + hourList[h+1]);
        }
    }
}