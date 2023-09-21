import java.util.*;

class Demo
{
   public Boolean CheckPrime(int iNo)
   {
      int iCnt = 0;

      for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            break;
         }
      }
      if(iCnt == (iNo/2)+1)
      {
         return true;

      }
      else
      {
         return false;
      }
   }
}

class CheckprimeNumber
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number :");
      int iNo = sobj.nextInt();

      Demo D = new Demo();

      Boolean BRet =  D.CheckPrime(iNo);

      if(BRet == true)
      {
         System.out.println("it is prime number");
      }
      else
      {
         System.out.println("it is not prime number");
      }
   }
}