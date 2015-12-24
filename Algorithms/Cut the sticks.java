import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nList = new ArrayList<>();

        for(int i = 0; i < n; i++)
            nList.add(in.nextInt());
        
        Collections.sort(nList);
        
        while(nList.size() > 0)
        {
            System.out.println(nList.size());
            int min = nList.get(0);
            for(int i = 0; i < nList.size(); i++)
                nList.set(i, nList.get(i) - min); 
            
            nList.removeAll(Collections.singleton(0));
        }
    }
}