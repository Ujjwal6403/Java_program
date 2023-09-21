import java.util.*;
class Demo
{
   public Boolean DisplayDigits(int iNo)
   {
      int iDigit = 0;

      while(iNo != 0)
      {
         iDigit = iNo % 10;
         if(iDigit == 8)
         {
            break;
         }
         iNo = iNo / 10;
      }
      if(iNo == 0)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
}
class CheckDigitsA2
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number");
      int iNo = sobj.nextInt();

      Demo D = new Demo();
      Boolean bRet = D.DisplayDigits(iNo);
      if(bRet == true)
      {
         System.out.println("Digit 8 is present in number");
      }
      else
      {
         System.out.println("Digit 8 is Not present in number");
      }
   }  
}