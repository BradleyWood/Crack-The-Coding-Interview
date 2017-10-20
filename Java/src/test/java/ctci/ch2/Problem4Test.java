package ctci.ch2;

import ctci.LinkedListNode;
import junit.framework.Assert;
import junit.framework.TestCase;

import static ctci.ch2.Problem4.addListDigitsIterative;

public class Problem4Test extends TestCase {

    public void testListDigitSum() {
        for (int i = 0; i < 1005; i++) {
            for(int j = 1005; j >= 0; j--) {
                LinkedListNode<Integer> a = createNum(i);
                LinkedListNode<Integer> b = createNum(j);
                LinkedListNode<Integer> sum = addListDigitsIterative(a, b);
                Assert.assertEquals(i + j, toInt(sum));
            }
        }
    }

    private LinkedListNode<Integer> createNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be >= 0");
        }
        LinkedListNode<Integer> head = new LinkedListNode<>(num % 10);
        LinkedListNode<Integer> next = head;
        num /= 10;
        while (num > 0) {
            LinkedListNode<Integer> node = new LinkedListNode<>(num % 10);
            next.setNext(node);
            next = node;
            num = num / 10;
        }
        return head;
    }

    private int toInt(LinkedListNode<Integer> num) {
        if (num == null)
            throw new IllegalArgumentException("NULL DIGIT LIST");
        int digitCount = 0;
        int sum = 0;

        LinkedListNode<Integer> node = num;
        while (node != null) {
            sum += (node.getData() * (int) Math.pow(10, digitCount++));
            node = node.getNext();
        }
        return sum;
    }
}