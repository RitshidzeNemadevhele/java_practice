package java2;

public class generatePermutation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String str = "ABC";    
	        int len = str.length();    
	        System.out.println("All the permutations of the string are: ");    
	        generate(str, 0, len);   

	}

	public static String swap(String w , int i, int j)
	{
		char[] li = w.toCharArray();
		
		char temp = li[i];
		
		li[i]= li[j];
		li[j]=temp;
		
		return String.valueOf(li); // return string of an array
		
	}
	
	public static void generate(String w , int s , int e) {
		
		if(s==e-1) {
		System.out.println( w);
		}
		else {
			
			for(int i =s ;i< e; i++) {
			
				w = swap(w,s,i);
				
				generate(w,s+1,e);
				
				w = swap(w,s,i);
				
				
			}
		}
		
	
	}
	
}
