public class removeSpace {
    public static void main(String[] args) {
        System.out.println( remove("hey world") );
    }
    public static String remove(String line) {
        return line.replace(" ", "");
        //.strip() remove spce infront and at the back
    } 
    
}
