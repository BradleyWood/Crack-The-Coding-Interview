package ctci.ch1;

import junit.framework.TestCase;

import java.util.Arrays;

import static ctci.ch1.Problem2.*;

public class Problem2Test extends TestCase {

    public static char[][] TEST = {
            { 'a', 'b', 'c', 'd', 0 },
            { 'h', 'e', 'l', 'l', 'o', 0 },
            { 'B', 'r', 'a', 'd', 'l', 'e', 'y', 0, 'o', 'k'},
            {0},
            { 'a', 0, 'b', 'c' },
    };

    public void testReverse() {
        for(char[] c_str : TEST) {
            char[] copy = Arrays.copyOf(c_str, c_str.length);
            reverse(c_str);
            // make sure it still ends with  null terminator
            assertTrue(c_str[len(c_str)] == 0);

            // reverse back and check that it equals the original
            reverse(c_str);
            assertTrue(Arrays.equals(copy, 0, len(copy), c_str, 0, len(c_str)));
        }
    }
}