package ctci.ch3;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Chapter 3 Problem 2
 */
public class MinStack extends Stack<Integer> {

    private final Stack<Integer> stk = new Stack<>();

    @Override
    public Integer push(Integer i) {
        if (i <= min())
            stk.push(i);
        return super.push(i);
    }

    @Override
    public Integer pop() {
        if (size() == 0)
            throw new EmptyStackException();

        Integer v = super.pop();
        if (v.equals(min())) {
            stk.pop();
        }
        return v;
    }

    public Integer min() {
        if (stk.isEmpty())
            return Integer.MAX_VALUE;
        return stk.peek();
    }

}