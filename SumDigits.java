import java.util.*;

class Demo
{
   public int SumDigits(int iNo)
   {
      int iSum = 0;

      int iDigit = 0;

      for(;iNo != 0;)
      {
         iDigit = iNo % 10;
        iSum = iSum + iDigit;
         iNo = iNo / 10;
      }
      return iSum;
   }
}
class SumDigits
{
   public static void main (String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number");
      int iNo = sobj.nextInt();

      Demo D = new Demo();

      int iRet = D.SumDigits(iNo);

      System.out.println("Sum of digits are : "+iRet);
   }
}