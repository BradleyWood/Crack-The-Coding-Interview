package ctci.ch2;

import ctci.LinkedListNode;

public class Problem3 {

    /**
     * Deletes a node from the linked list;
     * Problem states to solve as if it were singly linked
     *
     * The node cannot be the last element in the list
     *
     * @param node The node to delete
     */
    public static void deleteNode(LinkedListNode node) {
        LinkedListNode next;
        if(node == null || (next = node.getNext()) == null) {
            throw new IllegalArgumentException("Invalid list");
        }
        node.setData(next.getData());
        node.setNext(next.getNext());
    }
}
