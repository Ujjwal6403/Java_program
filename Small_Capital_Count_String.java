// import java.util.*;

// class Stringxx
// {
//     public int CountSmall(String str)
//     {
//         char Arr[] = str.toCharArray();
//         int iCnt = 0;

//         for(int i = 0; i < Arr.length; i++)
//         {
//             if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
//             {
//                 iCnt++;
//             }
//         }
//         return iCnt;
//     }

//     public int CountCapital(String str)
//     {
//         char Arr[] = str.toCharArray();
//         int icnt = 0;

//         for(int i = 0; i < Arr.length; i++)
//         {
//             if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
//             {
//                 icnt++;
//             }
//         }
//         return icnt;
//     }
// }
// public class Small_Capital_Count_String
// {
//    public static void main(String[] args) 
//    {
    
        
//        Scanner sobj = new Scanner(System.in);

//        System.out.println("Enter your name : ");
     
//        String Name = sobj.nextLine();

//        System.out.println("Your name is : "+Name);

//        System.out.println("Lenght of strins is : "+Name.length());

//        char str[] = Name.toCharArray();

//        for(int icnt =  0; icnt < str.length; icnt++)
//        {
//         System.out.println(Name.charAt(icnt));
//        }

//        Stringxx dobj = new Stringxx();

//        int iRet = dobj.CountSmall(Name);

//        System.out.println("Number of small character are : "+iRet);

//        iRet = dobj.CountCapital(Name);

//        System.out.println("Number of Capital character are : "+iRet);
//    }
   
// }

import java.util.*;

class Stringxx
{
    public int CountSmall(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    public int CountCapital(String str)
    {
      
        int icnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            {
                icnt++;
            }
        }
        return icnt;
    }
}
public class Small_Capital_Count_String
{
   public static void main(String[] args) 
   {
    
        
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter your name : ");
     
       String Name = sobj.nextLine();

       System.out.println("Your name is : "+Name);

       System.out.println("Lenght of strins is : "+Name.length());

       char str[] = Name.toCharArray();

       for(int icnt =  0; icnt < str.length; icnt++)
       {
        System.out.println(Name.charAt(icnt));
       }

       Stringxx dobj = new Stringxx();

       int iRet = dobj.CountSmall(Name);

       System.out.println("Number of small character are : "+iRet);

       iRet = dobj.CountCapital(Name);

       System.out.println("Number of Capital character are : "+iRet);
   }
   
}
