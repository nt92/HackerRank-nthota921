import java.util.*;
import java.io.*;
import java.util.Map;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      in.nextLine();
       
      Map<String, Integer> addressBook = new HashMap<String, Integer>();
          
      for(int i = 0;i < N ;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         addressBook.put(name, phone);
      }
      while(in.hasNext())
      {
         String s = in.nextLine();
         if(addressBook.containsKey(s))
             System.out.println(s+"="+addressBook.get(s));
         else
             System.out.println("Not found");
      } 
   } 
}