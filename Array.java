// import java.util.*;

// public class Array 
// {
//    public static void main(String args[])
//    {
//       Scanner sobj = new Scanner(System.in);
      
//       System.out.println("Enter number of elements : ");
//       int iSize = sobj.nextInt();

//       int Arr[] = new int[iSize];

//       System.out.println("Enter the elements : ");
//       int icnt = 0;

//       for(icnt = 0; icnt < iSize; icnt++)
//       {
//          Arr[icnt] = sobj.nextInt();
//       }

//       System.out.println("Elements of array are : ");
//       for(icnt = 0; icnt < iSize; icnt++)
//       {
//          System.out.println(Arr[icnt]);
//       }
//       sobj.close();
//    }
// }

import java.util.*;

public class Array 
{
   public static void main(String args[])
   {
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enter number of elements : ");
      int iSize = sobj.nextInt();

      int Arr[] = new int[iSize];

      System.out.println("Enter the elements : ");
      int icnt = 0;

      for(icnt = 0; icnt < Arr.length; icnt++)
      {
         Arr[icnt] = sobj.nextInt();
      }

      System.out.println("Elements of array are : ");
      for(icnt = 0; icnt < Arr.length; icnt++)
      {
         System.out.println(Arr[icnt]);
      }
      sobj.close();
   }
}
