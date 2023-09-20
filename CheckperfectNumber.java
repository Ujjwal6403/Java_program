import java.util.*;

class Displays
{
   public int  Display(int iNo)
   {
      int iCnt = 0;
      int iSum = 0;

      if(iNo < 0)
      {
         System.out.println("Error : Invalid Input.");
         System.out.println("Note : Please enter positive number");
       
      }

      for(iCnt = 1; iCnt < iNo; iCnt++)
      {
         if((iNo % iCnt)==0)
         {
            iSum  = iSum + iCnt;
         }
      }
      return iSum;

   }

   public Boolean Checkperfect(int iNumber)
   {
      Scanner sobj = new Scanner(System.in);

      int iResult = 0;

      iResult = Display(iNumber);

      if(iResult == iNumber)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
class CheckperfectNumber
{
   public static void main(String Args[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the frequency  :");
      int iNo = sobj.nextInt();

      Displays D = new Displays();

         Boolean bRet = D .Checkperfect(iNo);
      if(bRet == true)
      {
         System.out.println( iNo +" is a perfect number");
      }
      else
      {
         System.out.println(iNo +"is not a perfect number");
      }

   }
}