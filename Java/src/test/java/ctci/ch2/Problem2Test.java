package ctci.ch2;

import ctci.LinkedListNode;
import junit.framework.TestCase;

import static ctci.ch2.Problem2.nToLast;

public class Problem2Test extends TestCase {

    public void testNthToLast() {
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        LinkedListNode<Integer> element2 = new LinkedListNode<>(2);
        LinkedListNode<Integer> element3 = new LinkedListNode<>(3);
        LinkedListNode<Integer> element4 = new LinkedListNode<>(4);
        LinkedListNode<Integer> element5 = new LinkedListNode<>(5);
        LinkedListNode<Integer> element6 = new LinkedListNode<>(6);
        head.setNext(element2);
        element2.setNext(element3);
        element3.setNext(element4);
        element4.setNext(element5);
        element5.setNext(element6);

        for(int i = 1; i < 7; i++) {
            assertEquals(i, nToLast(head, 6 - i));
        }
        try {
            nToLast(head,7);
            fail("Index is out of bounds");
        } catch (Exception e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
        try {
            nToLast(head,-1);
            fail("Index less than zero");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
        try {
            nToLast(null,0);
            fail("Head is null");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
}