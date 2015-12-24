import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String inTime = in.next();
        
        String inHr = inTime.substring(0,2);
        String inMin = inTime.substring(3,5);
        String inSec = inTime.substring(6,8);
        String amOrpm = inTime.substring(8);
        
        int inHrNum = Integer.parseInt(inHr);
        
        String outTime = "";
        
        if(amOrpm.equals("PM") && inHrNum != 12)
        {
            outTime += 12+inHrNum + ":";
            outTime += inMin + ":";
            outTime += inSec;
        }
        else if(inHrNum == 12 && amOrpm.equals("AM"))
        {
            outTime += "00:";
            outTime += inMin + ":";
            outTime += inSec;
        }
        else
        {
            outTime += inHr + ":";
            outTime += inMin + ":";
            outTime += inSec;
        }
        
        System.out.println(outTime);
    }
}