import java.util.LinkedList;

public class revesrseLink {
    public static void main(String[] args) {
     LinkedList<Integer> ll = new LinkedList<>();
     ll.add(3);
     ll.add(6);
     ll.add(11);
     System.out.println(ll);

     LinkedList<Integer> ll1 = new LinkedList<>();

        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll1);
    }
    
}
