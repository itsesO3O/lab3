import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class LinkedListTests {


    @Test
    public void appendTest(){
        LinkedList are = new LinkedList();
        are.append(10);
        are.append(11);
        are.append(18);
        assertEquals("10 11 18", are.toString());
    }
}
