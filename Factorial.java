import java.util.*;

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