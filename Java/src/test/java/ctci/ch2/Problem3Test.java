package ctci.ch2;

import ctci.LinkedListNode;
import junit.framework.Assert;
import junit.framework.TestCase;

import static ctci.ch2.Problem3.deleteNode;

public class Problem3Test extends TestCase {

    public void testDeleteNode() {
        LinkedListNode head = createList(1, 25);

        Assert.assertTrue(contains(head, 1));
        Assert.assertTrue(contains(head, 2));
        Assert.assertTrue(contains(head, 3));
        Assert.assertTrue(contains(head, 4));

        deleteNode(head);
        Assert.assertTrue(!contains(head, 1));
        deleteNode(head);
        Assert.assertTrue(!contains(head, 2));
        deleteNode(head);
        Assert.assertTrue(!contains(head, 3));

        Assert.assertTrue(contains(head, 4));
    }

    private boolean contains(LinkedListNode head, Object data) {
        LinkedListNode node = head;
        while (node != null) {
            if (node.getData().equals(data)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    private LinkedListNode<Integer> createList(int a, int b) {
        LinkedListNode<Integer> head = new LinkedListNode<>(a);
        LinkedListNode<Integer> prev = head;
        for (int i = a + 1; i <= b; i++) {
            prev.setNext(prev = new LinkedListNode<>(i));
        }
        return head;
    }
}