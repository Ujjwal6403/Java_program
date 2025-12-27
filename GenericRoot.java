
import java.util.Scanner;

class Digit
{
   int GenericRoot(int iNo)
   {
      int isum = 0;
      int Digit = 0;

      while(iNo >= 10)
      {
         while(iNo != 0)
         {
             
         Digit = iNo % 10;
         isum = isum + Digit;
         iNo = iNo / 10;
         }

      if(isum >= 10)
      {
        iNo = isum;
        isum = 0;
      }
      else
      {
         iNo = isum;
         break;
      }
     
   }
   return iNo;
}
}

public class GenericRoot {
   public static void main(String[] args) 
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the Number : ");
       int iNo = sobj.nextInt();

       Digit dobj = new Digit();

       int iRet = dobj.GenericRoot(iNo);

      System.out.println("The generic root is :"+iRet);
   }
   
}
