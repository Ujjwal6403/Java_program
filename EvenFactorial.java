import java.util.*;

class Number
{
   public int EvenFact(int iValue)
   {
      int iMult = 1;

      for(int iCnt  = 1; iCnt <= iValue; iCnt++)
      {
         if((iValue % iCnt)== 0)
         {
            if((iCnt % 2) == 0 )
            {
               iMult = iMult * iCnt;
            }
         }
      }
      return iMult;
   }

}

class EvenFactorial
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number : ");
      int iNo = sobj.nextInt();

      Number Nobj = new Number();
      int iRet = Nobj.EvenFact(iNo);

      System.out.println("Multiplication of even Factorial is : "+iRet);
   }
}
