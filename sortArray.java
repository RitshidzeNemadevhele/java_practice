import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) { 
     
        int[] hh= {8,1,93,4,6,7,7,7};
        sort(hh);
        
    }
    public static void sort(int[] list)
    {
      Arrays.sort(list);
      System.out.println(Arrays.toString(list));
    }
    
}
