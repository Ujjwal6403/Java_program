import java.util.*;

class Demo
{
   public int  ReverseNumber(int iNo)
   {
      int iDigit = 0;
      int iReverse = 0;

      if(iNo < 0)
     {
      iNo = -iNo;
     }

      while(iNo != 0)
      {
            iDigit = iNo % 10;

            iReverse = (iReverse * 10)+ iDigit;
            iNo = iNo / 10;
      }
      return iReverse; // return the reversed number
      
   }
    
}

class ReverseNumber
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number : ");
      int iNo = sobj.nextInt();

      Demo D = new Demo();
    int iRet =   D.ReverseNumber(iNo);
    
   System.out.println("the reverse number is : "+iRet);

   

   }
}