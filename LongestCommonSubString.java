//java program to find longest common sub-string on two strings

public class LongestCommonSubString
{

  //main method
  public static void main(String[]  args)
   {

          String x1 ="hello";
          String x2 ="yellow";

         System.out.println(longest(x1, x2));

     }

  public static int longest(String s1 , String s2)
  {
     int max =0;

     for(int i =0 ; i<s1.length();i++)
     {
       for(int j =0 ; j<s2.length(); j++)
         {
          int count =0;
          int x=0;
            while(i+x< s1.length() && j+x< s2.length())
             {
              if(s1.charAt(i+x) == s2.charAt(j+x))
              {
                count++;  
                max = Math.max(count , max);
                 }
              else 
                {count =0;}
   
               x++;
                 }
             }
        
     }
        
       return max;
  }
}
