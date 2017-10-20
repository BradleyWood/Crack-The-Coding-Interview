package ctci;

public class LinkedListNode<E> {

    private LinkedListNode<E> next;
    private LinkedListNode<E> prev;
    private E data;

    public LinkedListNode(E data, LinkedListNode<E> next, LinkedListNode<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public LinkedListNode(E data) {
        this(data, null, null);
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    public LinkedListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode<E> prev) {
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
