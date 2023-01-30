//import java.util.Scanner;
public class reverseString {
    public static void main(String[] args){
    //  Scanner input = new Scanner(System.in);
         
    System.out.println(reverse("heyy"));

    }
    
    public static 
    String reverse(String word){

        String output=""; 
        for(int i=word.length()-1; i>=0;i--)
        {
            output = output + word.charAt(i);
        }

        return output;
    }
}