import static org.junit.Assert.*;

import java.beans.Transient;
import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppendOneElement() {
        LinkedList ll1 = new LinkedList();
        ll1.append(0);
        assertEquals(0, ll1.first());
    }

    @Test
    public void testPrependOnly() {
        LinkedList ll1 = new LinkedList();
        ll1.prepend(0);
        assertEquals(0, ll1.first());
    }

    @Test
    public void testPrependExisted() {
        LinkedList ll1 = new LinkedList();
        ll1.append(0);
        ll1.append(1);
        ll1.append(2);
        ll1.prepend(144);
        assertEquals(144, ll1.first());
    }

    // if this test fails there might be a problem with
    // the .append() method as well as the .last() method
    @Test
    public void testAppendMultipleElements() {
        LinkedList ll1 = new LinkedList();
        ll1.append(0);
        ll1.append(1);
        ll1.append(2);
        ll1.append(3);
        ll1.append(4);
        ll1.append(5);
        assertEquals(5, ll1.last());
    }

    // ask about this in the office hours
    // https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-tests
    @Test
    public void testFirstNone() {
        boolean thrown = false;
        try {
            LinkedList ll1 = new LinkedList();
            int resultNumber = ll1.first();

        } catch (NoSuchElementException exception) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testFirstManyElems() {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(2);
        assertEquals(1, ll1.first());
    }

    @Test
    public void testLastNone() {
        boolean thrown = false;
        try {
            LinkedList ll1 = new LinkedList();
            int resultNumber = ll1.last();

        } catch (NoSuchElementException exception) {
            thrown = true;
        }
        assertTrue(thrown);

    }

    @Test
    public void testLastOne() {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        assertEquals(1, ll1.last());
    }

    @Test
    public void testLastMany() {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(2);
        assertEquals(2, ll1.last());
    }

    @Test
    public void testToStringMany() {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(2);
        ll1.append(3);
        assertEquals("1 2 3", ll1.toString());
    }

    @Test
    public void testToStringNone() {
        LinkedList ll1 = new LinkedList();
        assertEquals("", ll1.toString());
    }

    @Test
    public void testLengthNone() {
        LinkedList ll1 = new LinkedList();
        assertEquals(0, ll1.length());
    }

    @Test
    public void testLengthMany() {
        LinkedList ll1 = new LinkedList();
        ll1.append(6);
        ll1.append(6);
        ll1.append(6);
        ll1.append(6);
        ll1.append(6);
        ll1.append(6);
        ll1.append(6);
        assertEquals(7, ll1.length());
    }
}