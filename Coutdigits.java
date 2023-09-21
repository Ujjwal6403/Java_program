import java.util.*;

class Demo
{
   public int CoutDigits(int iNo)
   {
      int iCnt = 0;

      while(iNo != 0)
      {
         iCnt ++;
         iNo = iNo / 10;
      }
      return iCnt;
   }
}
class Coutdigits
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner (System.in);

      System.out.println("Enter Number");
      int iNo = sobj.nextInt();

      Demo  D = new Demo();

      int iRet = D.CoutDigits(iNo);

      System.out.println("Number of digits are : "+iRet);
   }
}