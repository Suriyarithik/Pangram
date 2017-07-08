# Pangram
import java.util.*;
public class Pangram
{
  public static void main(String args[])
  {
  int i,j,count=0;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the String: ");
    String n=br.readLine();
    for(i=0;i<=n.length();i++)
    {
       if(((n.charAt(i) >='A')&&(n.charAt(i) <='Z'))||((n.charAt(i) >='a')&&(n.charAt(i) <='z')))
       {
       count++;
       }
    }
       if(count++==26)
       {
          System.out.println("Is a pangram");
       }
       else
       {
          System.out.println("Is Not a pangram");
       }
    }
  }  
     
