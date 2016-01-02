//DAY 1, print datatypes

public class DataTypesPractice 
{
    public static void main(String[] args) 
    {
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : int");
        System.out.println("Referenced : String");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Referenced : String");
    }
}

//DAY 2 Calculate tip value

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage
      
        double total = M + (T * M)/100 + (X * M)/100;
        System.out.printf("The final price of the meal is $%2.0f.", total);
      
    }
}