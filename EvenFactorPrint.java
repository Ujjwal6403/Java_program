import java.util.*;
public class EvenFactorPrint 
{
   public static void main(String[] args) 
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the number : ");
       int iNo = sobj.nextInt();

       for(int i = 2; i <= iNo/2; i+=2)  // n/2
       {
         if((iNo % i) == 0)
         {
            System.out.println("element "+i);
         }
       }
   }
   
}
