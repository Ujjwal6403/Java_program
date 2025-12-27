import java.util.*;

class Stringxx
{
    public String strLowerX(String str)
    {
      // step 1 : Convert String to array
        char Arr[] = str.toCharArray();

      // step 2 : Perform operations on array
        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
        }
        // step 3 : Convert Array to string 

        String ret = new String(Arr);

        return ret;
    }

    public String strUpperX(String str)
    {
      char Arr[] = str.toCharArray();

      for(int icnt = 0; icnt < Arr.length; icnt++)
      {
         if((Arr[icnt] >= 'a') && (Arr[icnt] <= 'z'))
         {
            Arr[icnt] = (char)(Arr[icnt] - 32);
         }
      }
      String ret = new String(Arr);
      return ret;
    }
}
public class StrLowerUpper
{
   public static void main(String[] args) 
   {

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter your name : ");
     
       String Name = sobj.nextLine();


       Stringxx dobj = new Stringxx();

       String sRet = dobj.strLowerX(Name);
       System.out.println("Converted String is Lower  : "+sRet);

       sRet = dobj.strUpperX(Name);
       System.out.println("Converted String is Upper : "+sRet);

   }
   
}
