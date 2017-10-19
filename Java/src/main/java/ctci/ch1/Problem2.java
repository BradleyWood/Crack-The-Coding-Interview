package ctci.ch1;

public class Problem2 {

    /**
     * Reverse a c-style string (null terminated)
     * Yes this is java, but the logic is the same
     *
     * @param c_str The string to reverse
     */
    public static void reverse(char[] c_str) {
        if(c_str == null)
            return;

        int len = len(c_str);
        if(len <= 1)
            return;

        for(int i = 0; i < len/2; i++) {
            char tmp = c_str[i];
            c_str[i] = c_str[len - 1 - i];
            c_str[len - 1 - i] = tmp;
        }
    }
    public static int len(char[] c_str) {
        int len = 0;
        while (len < c_str.length && c_str[len++] != 0);
        return len - 1;
    }
}
