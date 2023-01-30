public class odd{
    public static void main(String[] args){
        int[] fi = {1,5,7,9};
         System.out.println( check(fi));

    }

    private static boolean check(int[] li){

        //boolean out= true;
        for(int i = 0; i<li.length ;i++){
            if(li[i]%2==0)
               return false;
        }

        return true;
    }

}