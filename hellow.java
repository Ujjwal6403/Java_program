import java.util.*;
class hellow
{
   public static void main(String arg[])

   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter First number : ");
      int iNo1 = sobj.nextInt();

      System.out.println("Enter second number : ");
      int iNo2 = sobj.nextInt();

      int iAns = 0;
      iAns = iNo1 + iNo2;

      System.out.println("Result is : "+iAns);

   }
}