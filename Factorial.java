import java.util.*;

<<<<<<< HEAD
class Number
{
   public int Factorial(int iValue)
   {
      int iMult = 1;

      for(int iCnt = 1; iCnt <= iValue; iCnt++)
      {
         iMult = iMult * iCnt;
      }
      return iMult;
   }
}

public class Factorial 
{
   public static void main(String arg[])
   {
      Scanner sobj  = new Scanner(System.in);

      System.out.println("Enter numer : ");
      int iNo = sobj.nextInt();

      Number nobj = new Number();

      int iRet = nobj.Factorial(iNo);

      

      System.out.println("Factorial is : "+iRet);

   }
   
}
=======
class Factorial
{
   public static void main(String Args[])
   {
   Scanner sobj = new Scanner(System.in);

   System.out.println("Entetr Number : ");
   int iNo = sobj.nextInt();

   int iMult = 1;

   for(int iCnt = 1 ; iCnt <= iNo; iCnt++)
   {
      iMult = iMult * iCnt ;
   }
   
   System.out.println("Factorial is : "+iMult);
   }
}
>>>>>>> e19b41c40a407939933249ee250bc5577d668bcb
