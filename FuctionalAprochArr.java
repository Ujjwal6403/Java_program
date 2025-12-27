import java.util.*;

class ArrayX
{
   public int Arr[];

   public ArrayX(int iSize)
   {
      Arr = new int[iSize];
   }

   public void Accept()
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the elements : ");
      for(int icnt = 0; icnt < Arr.length; icnt++)
      {
         Arr[icnt] = sobj.nextInt();
      }
   }

   public void Display()
   {
      System.out.println("Elements of array are : ");
      for(int icnt = 0; icnt < Arr.length; icnt++)
      {
         System.out.println(+Arr[icnt]);
      }
      System.out.println();
   }
}
public class FuctionalAprochArr 
{
   public static void main(String[] args)
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter number of elements : ");
       int iSize = sobj.nextInt();

       ArrayX aobj = new ArrayX(iSize);
       aobj.Accept();
       aobj.Display();

   }
   
}
