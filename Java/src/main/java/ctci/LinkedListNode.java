package ctci;

public class LinkedListNode<E> {

    private LinkedListNode next;
    private LinkedListNode prev;
    private E data;

    public LinkedListNode(E data, LinkedListNode next, LinkedListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public LinkedListNode(E data) {
        this(data, null, null);
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
