import java.util.*;
class Demo
{
   public void DisplayDigits(int iNo)
   {
      int iDigit = 0;

      for(;iNo != 0;)
      {
         iDigit = iNo % 10;
         System.out.println(iDigit);
         iNo = iNo / 10;
      }
   }
}
class DisplayDigits
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number");
      int iNo = sobj.nextInt();

      Demo D = new Demo();
      D.DisplayDigits(iNo);
   }
}