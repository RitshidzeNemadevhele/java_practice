public class vowels{
    public static void main(String[] args) {
        System.out.print( check("hheh"));
    }

    static boolean check (String str)
    {   boolean out = false;
        for(int i =0;i<str.length();i++)
        {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u' )
                   out = true;

        }

    return out;
    }
}