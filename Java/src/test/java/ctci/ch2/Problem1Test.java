package ctci.ch2;

import ctci.LinkedListNode;
import junit.framework.TestCase;

import java.util.HashSet;

public class Problem1Test extends TestCase {

    public void testRemoveDuplicates() {
        LinkedListNode<String> listHead = new LinkedListNode<>("123");
        LinkedListNode<String> l1 = new LinkedListNode<>("321");
        listHead.setNext(l1);
        l1.setPrev(listHead);
        LinkedListNode<String> l2 = new LinkedListNode<>("123");
        l2.setPrev(l1);
        l1.setNext(l2);

        ctci.ch2.Problem1.removeDuplicates(listHead);

        assertNoDuplicates(listHead);
    }
    private void assertNoDuplicates(LinkedListNode n) {
        HashSet items = new HashSet();
        while (n != null) {
            if(items.contains(n.getData())) {
                fail();
            } else {
                items.add(n.getData());
            }
            n = n.getNext();
        }
    }
    public void testRemoveDuplicates2() {
        LinkedListNode<String> listHead = new LinkedListNode<>(null);
        LinkedListNode<String> l1 = new LinkedListNode<>("1231");
        listHead.setNext(l1);
        l1.setPrev(listHead);
        LinkedListNode<String> l2 = new LinkedListNode<>(null);
        l2.setPrev(l1);
        l1.setNext(l2);

        ctci.ch2.Problem1.removeDuplicatesNoDataStructure(listHead);
        assertNoDuplicates(listHead);
    }
}