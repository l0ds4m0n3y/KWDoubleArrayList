import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        KWLinkedList<String> myList = new KWLinkedList<>();
        ListIterator<String> iter = myList.listIterator(0);
        iter.next();
        iter.remove();
        //System.out.println(iter.next());
        
        // iter.next();
        // iter.remove(); //1B
        // System.out.println(iter.next());

        // System.out.println(myList.indexOf("1"));
        
        ListIterator<String> iterter = myList.listIterator(0);
        while(iterter.hasNext()){
            System.out.println(iterter.next());
        }
        
    }
}
