package ctci.ch3;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MinStackTest extends TestCase {

    public void testMin() {
        MinStack stk = new MinStack();
        stk.push(1);
        stk.push(100);
        stk.push(1000);

        Assert.assertEquals((Integer) 1, stk.min());
        Assert.assertEquals((Integer) 1000, stk.pop());
        Assert.assertEquals((Integer) 1, stk.min());
        Assert.assertEquals((Integer) 100, stk.pop());
        Assert.assertEquals((Integer) 1, stk.min());

        stk.pop();
        Assert.assertTrue(stk.isEmpty());

        stk.push(1000);
        Assert.assertEquals((Integer) 1000, stk.min());
        stk.push(100);
        Assert.assertEquals((Integer) 100, stk.min());
        stk.push(1);
        Assert.assertEquals((Integer) 1, stk.min());

        Assert.assertEquals((Integer) 1, stk.pop());
        Assert.assertEquals((Integer) 100, stk.min());
        
        Assert.assertEquals((Integer) 100, stk.pop());
        Assert.assertEquals((Integer) 1000, stk.min());
    }
}