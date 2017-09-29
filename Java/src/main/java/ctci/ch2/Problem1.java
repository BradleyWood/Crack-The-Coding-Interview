package ctci.ch2;

import ctci.LinkedListNode;

import java.util.HashSet;
import java.util.Objects;

public class Problem1 {

    public static void removeDuplicates(LinkedListNode head) {
        HashSet hashSet = new HashSet();
        LinkedListNode n = head;
        while(n != null) {
            if(hashSet.contains(n.getData())) {
                n.getPrev().setNext(n.getNext());
                if(n.getNext() != null) {
                    n.getNext().setPrev(n.getPrev());
                }
            } else {
                hashSet.add(n.getData());
            }
            n = n.getNext();
        }
    }
    public static void removeDuplicatesNoDataStructure(LinkedListNode head) {
        LinkedListNode a = head;
        while(a != null) {
            LinkedListNode b = head.getNext();
            while(b != null) {
                if(Objects.equals(a.getData(), b.getData())) {
                    b.getPrev().setNext(b.getNext());
                    if(b.getNext() != null) {
                        b.getNext().setPrev(b.getPrev());
                    }
                }
                b = b.getNext();
            }
            a = a.getNext();
        }
    }
}
