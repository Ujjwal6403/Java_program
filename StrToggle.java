import java.util.*;

class StringX
{
   public String StrToggleX(String str)
   {
      // step 1 : Convert String to array
      char Arr[] = str.toCharArray();

      for(int i = 0; i < Arr.length;i++)
      {
         if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
         {
            Arr[i] = (char)(Arr[i] + 32);
         }
         else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
         {
            Arr[i] = (char)(Arr[i] - 32);
         }
      }
      String ret = new String(Arr);

      return ret;
   }


}
public class StrToggle
{
   public static void main(String args[])
   {
      Scanner sobj = new Scanner(System.in);
   
       System.out.println("Enter the String : ");
       String Name = sobj.nextLine();

       StringX obj = new StringX();

      String sret =  obj.StrToggleX(Name);

       System.out.println("Converted String is : "+sret);

   }
   
}
