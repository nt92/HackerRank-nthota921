//Checks if an anagram of a selected string can possibly be a palindrome by checking each unique character in the string and making sure that 
//at most one character has an odd occurance.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
       
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for(int i = 0; i < input.length(); i++)
            isItThere[input.charAt(i)] = true;
        
        int numOdd = 0;
        for(int i = 0; i < isItThere.length; i++)
        {
            int numChars = 0;
            if(isItThere[i])
            {
                for(int j = 0; j < input.length(); j++)
                {
                    if(input.charAt(j) == i)
                        numChars++;
                }
            }
            if(numChars % 2 != 0)
                numOdd++;
        }
        
        if(numOdd > 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}