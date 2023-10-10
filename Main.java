import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");        
        myList.add("B");
        myList.add("C");
        myList.add("D");
        
        ListIterator<String> iter = myList.listIterator(myList.size()-1);
        iter.previous();
        iter.previous();
        iter.next();
    }
}
