
// import java.util.Scanner;

// class Digits
// {
//    int SumDigit(int iNo)
//    {
//       int iSum = 0;
//       int iDigit = 0;

//       while(iNo != 0)
//       {
//          iDigit = iNo % 10;
//          iSum = iSum + iDigit;
//          iNo = iNo / 10;
//       }
//       return iSum;
//    }
// }
// public class SumDigit 
// {
//    public static void main(String[] args) 
//    {
//        Scanner sobj = new Scanner(System.in);

//        System.out.println("Enter the number :");
//        int iNo = sobj.nextInt();

//        Digits dobj = new Digits();
//        int iRet = dobj.SumDigit(iNo);

//        System.out.println("Sum of Digits is : "+iRet);

//    } 
// }


import java.util.Scanner;

class Digits
{
   int SumDigit(int iNo)
   {
      int iSum = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      while(iNo != 0)
      {
         iSum = iSum + (iNo % 10);
         iNo = iNo / 10;
      }
      return iSum;
   }
}
public class SumDigit 
{
   public static void main(String[] args) 
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the number :");
       int iNo = sobj.nextInt();

       Digits dobj = new Digits();
       int iRet = dobj.SumDigit(iNo);

       System.out.println("Sum of Digits is : "+iRet);

   } 
}

