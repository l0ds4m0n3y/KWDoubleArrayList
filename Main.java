import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        KWLinkedList<String> myList = new KWLinkedList<>();
        myList.add(0,"A");
        myList.add(1,"B");
        myList.add(2,"C");
        myList.add(3,"D");

        ListIterator<String> iter = myList.listIterator(0);
        ListIterator<String> iterter = myList.listIterator(0);

        //System.out.println(myList.indexOf("B"));
        iter.next();
        iter.remove(); //1B

        while(iterter.hasNext()){
            System.out.println(iterter.next());
        }
        
    }
}
