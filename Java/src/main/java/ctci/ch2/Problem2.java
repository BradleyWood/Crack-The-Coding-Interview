package ctci.ch2;

import ctci.LinkedListNode;

public class Problem2 {

    public static Object nToLast(LinkedListNode head, int n) {
        if(head == null || n < 0) {
            throw new IllegalArgumentException();
        }
        int size = 1;

        LinkedListNode node = head;
        while ((node = node.getNext()) != null) {
            size++;
        }
        if(size <= n) {
            throw new IndexOutOfBoundsException();
        }
        node = head;
        for(int i = 0; i < size - n - 1; i++) {
            node = node.getNext();
        }
        return node.getData();
    }
}
