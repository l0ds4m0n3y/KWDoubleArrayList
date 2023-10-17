import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.*;


public class KWDLLTest {
    //testing one by one works, but not all at once

    private static KWLinkedList<String> myList;
    private static KWLinkedList<String> oneElementList = new KWLinkedList<>();

    @BeforeAll
    public static void setUp(){
        myList = new KWLinkedList<>();
        myList.add(0,"0");
        myList.add(1,"1");
        myList.add(2,"2");
        myList.add(3,"3");

        oneElementList.add("seven");
    }
    
    @Test
    void testInitIter(){
        for(int i = 0; i < myList.size(); i++){
            ListIterator<String> iter = myList.listIterator(i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> {
            myList.listIterator(myList.size() + 1);
        });
    }

    @Test
    void testIndexOf(){
        for(int i = 0; i < myList.size(); i++){
            assertEquals(i, myList.indexOf(String.valueOf(i)));
        }
        myList.add(4, "2");
        assertEquals(2, myList.indexOf("2"));
        assertEquals(-1, myList.indexOf("8"));
        myList.remove(4);
    }

    @Test
    void testLastIndexOf(){
        for(int i = 0; i < myList.size(); i++){
            assertEquals(i, myList.lastIndexOf(String.valueOf(i)));
        }
        myList.add(4, "2");
        assertEquals(4, myList.lastIndexOf(String.valueOf("2")));
        assertEquals(-1, myList.lastIndexOf("7"));
        myList.remove(4);
    }

    @Test
    void testRemoveOnlyElement(){
        ListIterator<String> iter = oneElementList.listIterator(0);
        iter.next();
        iter.remove();

        assertThrows(NoSuchElementException.class, () -> {
            oneElementList.get(0);
        });
    }

    @Test
    void testRemoveFirst(){
        ListIterator<String> iter = myList.listIterator(0);
        iter.next();
        iter.remove();
        assertEquals("1", iter.next());
    } 
    
    @Test
    void testMiddle(){
        ListIterator<String> iter = myList.listIterator(0);
        iter.next();

        iter.next();
        iter.remove();
        assertEquals("2", iter.next());
        
        iter.remove();
        assertEquals("3", iter.next());
    }

    @Test
    void removeLast(){
        ListIterator<String> iter = myList.listIterator(myList.size());
        assertEquals("3", iter.previous());
        iter.remove();
        assertEquals("2", myList.get(myList.size() - 1));
    }

    @Test   
    void testSetForwards(){
        ListIterator<String> iter = myList.listIterator(0);
        iter.next();
        iter.set("7");
        assertEquals("7", iter.previous());
        iter.next();
        iter.next();
        iter.set("7");
        assertEquals("7", iter.previous());
        iter.next();
        iter.next();
        iter.set("7");
        assertEquals("7", iter.previous());
        iter.next();
        iter.next();
        iter.set("7");
        assertEquals("7", iter.previous());
    }
    @Test
    void testSetBackwards(){
        ListIterator<String> iter = myList.listIterator(myList.size());
        iter.previous();
        iter.set("7");
        assertEquals("7", iter.next());
        iter.previous();
        iter.previous();
        iter.set("7");
        assertEquals("7", iter.next());
        iter.previous();
        iter.previous();
        iter.set("7");
        assertEquals("7", iter.next());
        iter.previous();
        iter.previous();
        iter.set("7");
        assertEquals("7", iter.next());
    }
}
