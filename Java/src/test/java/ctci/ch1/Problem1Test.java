package ctci.ch1;

import junit.framework.TestCase;

import static ctci.ch1.Problem1.*;

public class Problem1Test extends TestCase {

    public static final String[] TEST_NOT_UNIQUE = {
            null,
            "",
            "aaa",
            "aab",
            "test",
            "1_2345678901",
    };
    public static final String[] TEST_UNIQUE = {
            " ",
            "abcdefghi",
            "12z_=58aAZ",
    };


    public void testAllCharsUnique() {
        for (int i = 0; i < TEST_NOT_UNIQUE.length; i++) {
            assertEquals(allCharsUnique(TEST_NOT_UNIQUE[i]), false);
        }
        for (int i = 0; i < TEST_UNIQUE.length; i++) {
            assertEquals(allCharsUnique(TEST_UNIQUE[i]), true);
        }
    }

    public void testAllCharsUniqueNoDataStruct() {
        for (int i = 0; i < TEST_NOT_UNIQUE.length; i++) {
            assertEquals(allCharsUniqueNoDataStruct(TEST_NOT_UNIQUE[i]), false);
        }
        for (int i = 0; i < TEST_UNIQUE.length; i++) {
            assertEquals(allCharsUniqueNoDataStruct(TEST_UNIQUE[i]), true);
        }
    }
}