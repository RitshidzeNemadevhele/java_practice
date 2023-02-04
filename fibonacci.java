public class fibonacci {
    public static void main(String[] args){
       
        int n=9;

        if(n<0)
        {
            System.out.println("Fiboncci for "+n+ " is not available");

        }
        else{
            System.out.println( Fib(n)) ;
        }


    }

    public static int Fib (int n)
    {
      if(n<1){
        return n;
      }
      else  {
        return Fib(n-1) + Fib(n-2);
    
    }
    
    }
}
