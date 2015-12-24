import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        boolean lateDay = d1 > d2;
        boolean lateMonth = m1 > m2;
        boolean lateYear = y1 > y2;
        
        if(!(lateDay || lateMonth || lateYear) || y1 < y2 || ((y1 == y2) && (m1 < m2)))
            System.out.println(0);
        else if(!lateYear && !lateMonth && lateDay)
            System.out.println((d1 - d2) * 15);
        else if(!lateYear && lateMonth)
            System.out.println((m1 - m2) * 500);
        else if(lateYear)
            System.out.println(10000);
            
    }
}