import java.util.*;

class Digits
{

   boolean checkAmostrongNo(int iNo)
   {
      int iTemp = iNo;

      int iCount = 0;
      while(iTemp != 0)
      {
         iCount++;
         iTemp = iTemp / 10;
      }

      iTemp = iNo;

      int iSum = 0, iPower = 1, iCnt = 0, iDigit = 0;


      while(iNo != 0)
      {
         iDigit = iNo % 10;

         for(int i = 1; i <= iCount; i++)
         {
            iPower = iPower * iDigit;
         }

         iSum = iSum + iPower;
         iPower = 1;
         iNo = iNo / 10;
      }

      if(iSum == iTemp)
      {
         return true;
      }
      else
      {
         return false;
      }
   } 
}

class CheckAmostrongNo
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number : ");
      int iNo = sobj.nextInt();

      Digits dobj = new Digits();

      boolean bRet = dobj.checkAmostrongNo(iNo);

      if(bRet == true)
      {
         System.out.println("number is armstrong");
      }
      else
      {
         System.out.println("Number is not armstrong");
      }
       
   }
}