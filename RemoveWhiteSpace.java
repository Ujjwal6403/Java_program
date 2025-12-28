import java.util.*;

class StringX
{
   public String RemoveWhiteSpace(String Str)
   {
      char Arr[] = Str.toCharArray();
      String output = "";

      for(int iCnt = 0; iCnt < Arr.length; iCnt++)
      {
         if(Arr[iCnt] != ' ')
         {
            output = output + Arr[iCnt];
         }
      }
      return output;
   }
}

public class RemoveWhiteSpace 
{
   public static void main(String[] args)
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter your name");
       String name = sobj.nextLine();

       StringX obj = new StringX();
       String sret = obj.RemoveWhiteSpace(name);

       System.out.println("Result is : "+sret);
   }
   
}
