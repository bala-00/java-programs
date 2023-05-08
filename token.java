import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
public class token
{
   public static void main(String[]args)
   {
      int sum=0,n;
      System.out.println("enter the integers with one space");
      Scanner sc=new Scanner(System.in);
      String ch=sc.nextLine();
      StringTokenizer st=new StringTokenizer(ch," ");
      System.out.println("The Integers Present are :");
      while(st.hasMoreTokens())
      {
          String temp=st.nextToken();
          n=Integer.parseInt(temp);
          sum=sum+n;
          System.out.println(n);
       }
       System.out.println("The sum is "+sum);

       }
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
