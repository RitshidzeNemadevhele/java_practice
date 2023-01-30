public class palindrome{
 public static void main(String[] args) {
        
        System.out.println(check("ryr"));

    }
    private static boolean check(String word){
         
        int len = word.length()-1;

        for(int i=0; i< word.length();i++)
        {
            if(word.charAt(i)!= word.charAt(len-i) )
            {
                return false;
            }
            
            //System.out.println(out);
        }

        return true;
}
}
