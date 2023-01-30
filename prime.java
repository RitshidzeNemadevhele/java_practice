public class prime {
    public static void main(String[] args)
    {
        System.out.println(primee(2));

    }

    private static boolean primee(int num)
    {
       if(num==1 || num ==0)
       {
        return false;
       }
       else 
       {
        for(int i =2; i<= num/2;i++)
        {
            if(num%i ==0)
            {
                return false;
            }

        }
         return true;
       }

    } 
}
