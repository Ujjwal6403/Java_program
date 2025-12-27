import java.util.*;

class Number
{
   public int EvenFactor(int iValue)
   {
      int iMult = 1;
      for(int i = 1; i <= iValue; i++)
      {
         if((iValue % i)== 0)
         {
            if((i % 2) == 0)
            {
               iMult = iMult * i;
            }
         }
      }
      return iMult;
   }
}

public class EvenFactor
{
   public static void main(String arg[])
   {
      Scanner sobj  = new Scanner(System.in);

      System.out.println("Enter numer : ");
      int iNo = sobj.nextInt();

      Number nobj = new Number();

      int iRet = nobj.EvenFactor(iNo);

      

      System.out.println("EvenFactor  is : "+iRet);

   }
   
}

// import java.util.*;

// class Number
// {
//    public int EvenFactor(int iValue)
//    {
//       int iMult = 1;
//       for(int i = 1; i <= iValue; i++)
//       {
//          if((iValue % i)== 0) && ((i % 2) == 0))
//             
//             {
//                iMult = iMult * i;
//             }
//          }
//       }
//       return iMult;
//    }
// }

// public class EvenFactor
// {
//    public static void main(String arg[])
//    {
//       Scanner sobj  = new Scanner(System.in);

//       System.out.println("Enter numer : ");
//       int iNo = sobj.nextInt();

//       Number nobj = new Number();

//       int iRet = nobj.EvenFactor(iNo);

      

//       System.out.println("EvenFactor  is : "+iRet);

//    }
   
// }