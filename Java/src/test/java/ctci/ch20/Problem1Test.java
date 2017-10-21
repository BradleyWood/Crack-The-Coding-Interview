package ctci.ch20;

import junit.framework.Assert;
import junit.framework.TestCase;

import static ctci.ch20.Problem1.add;

public class Problem1Test extends TestCase {

    public void testAdd() {
        int calculated = add(-10, 10);
        Assert.assertEquals(0, calculated);
        calculated = add(-11, 10);
        Assert.assertEquals(-1, calculated);
        calculated = add(-10, 11);
        Assert.assertEquals(1, calculated);

        calculated = add(100000, Integer.MAX_VALUE);
        Assert.assertEquals(100000 + Integer.MAX_VALUE, calculated);

        calculated = add(100000, Integer.MIN_VALUE);
        Assert.assertEquals(100000 + Integer.MIN_VALUE, calculated);

        calculated = add(-100000, Integer.MIN_VALUE);
        Assert.assertEquals(-100000 + Integer.MIN_VALUE, calculated);

        calculated = add(100, 100);
        Assert.assertEquals(200, calculated);

        calculated = add(-100, -100);
        Assert.assertEquals(-200, calculated);
    }
}