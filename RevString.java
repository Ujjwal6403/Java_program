
// class RevString
// {
//    public static void main(String[] args) 
//    {
//        String str = "java";
//        String rev = "";

//        for(int i = str.length()-1; i >= 0; i--)
//        {
//          rev = rev + str.charAt(i);
//        }

//        System.out.println("Reverse: " + rev);
//    }
// }

class RevString
{
   public static void main(String[] args) 
   {
      String str = "madam";
      String rev = "";

      for(int i = str.length()-1; i >= 0; i--)
      {
         rev += str.charAt(i);
      }

      if(str.equals(rev))
      {
         System.out.println("pallindrome");
      }
      else
      {
         System.out.println("Not Palindrome");
      }
   }
}