import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class ListTests {
    static KWLinkedList<String> myList = new KWLinkedList<>();;
    
    @BeforeAll
    public static void setUp(){
        myList.add(0,"A");
        myList.add(1,"B");
        myList.add(2,"C");
        myList.add(3,"D");
        myList.add(4,"B");
    }

    @Test
    public void testindexOf(){
        assertEquals(0, myList.indexOf("A"));
        assertEquals(1, myList.indexOf("B"));
        assertEquals(2, myList.indexOf("C"));
        assertEquals(3, myList.indexOf("D"));
        assertEquals(1, myList.indexOf("B"));
    }
    @Test
    public void testLast(){
        assertEquals(0, myList.lastIndexOf("A"));
        assertEquals(1, myList.lastIndexOf("B"));
        assertEquals(2, myList.lastIndexOf("C"));
        assertEquals(3, myList.lastIndexOf("D"));
        assertEquals(1, myList.lastIndexOf("B"));
    }
}
