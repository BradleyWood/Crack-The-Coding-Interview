package ctci.ch2;

import ctci.LinkedListNode;

public class Problem4 {

    /**
     * Adds two numbers each in the form of a list of digits
     *
     * @param numA
     * @param numB
     * @return The sum as linked list
     */
    public static LinkedListNode<Integer> addListDigitsIterative(LinkedListNode<Integer> numA, LinkedListNode<Integer> numB) {
        if(numA == null || numB == null) {
            throw new IllegalArgumentException();
        }
        LinkedListNode<Integer> sum = null;
        LinkedListNode<Integer> next = null;
        int carry = 0;

        LinkedListNode<Integer> nodeA = numA;
        LinkedListNode<Integer> nodeB = numB;
        while(nodeA != null || nodeB != null) {
            int a = nodeA != null ? nodeA.getData() : 0;
            int b = nodeB != null ? nodeB.getData() : 0;
            if(a > 9 || b > 9)
                throw new IllegalArgumentException("Number is two digits");
            if(a < 0 || b < 0)
                throw new IllegalArgumentException("Digit is negative");
            int s = (a + b + carry);
            carry = s >= 10 ? 1 : 0;
            s = s % 10;
            LinkedListNode<Integer> digitSum = new LinkedListNode<>(s);
            if(sum == null) {
                sum = digitSum;
            } else {
                digitSum.setPrev(next);
                next.setNext(digitSum);
            }
            next = digitSum;

            nodeA = nodeA != null ? nodeA.getNext() : null;
            nodeB = nodeB != null ? nodeB.getNext() : null;
        }
        next.setNext(new LinkedListNode<>(carry));
        return sum;
    }

}
