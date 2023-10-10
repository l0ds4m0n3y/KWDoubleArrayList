import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        KWLinkedList<String> myList = new KWLinkedList<>();
        myList.add(0,"A");
        myList.add(1,"B");
        myList.add(2,"C");
        myList.add(3,"D");
        myList.add(4,"B");

        ListIterator<String> iter = myList.listIterator(0);
        System.out.println(myList.lastIndexOf("B"));
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}
