package ctci.ch1;

public class Problem1 {

    /**
     * Tests whether all characters in a string are unique.
     * If a null or empty string is passed we will return false
     *
     * @param str The string to test - ASCII
     * @return True if all the characters are unique
     */
    public static boolean allCharsUnique(String str) {
        if (str == null || str.length() == 0 || str.length() > 255)
            return false;
        boolean[] visited = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (visited[ch])
                return false;
            visited[ch] = true;
        }
        return true;
    }

    /**
     * Tests whether all characters in a string are unique, but
     * no data structure is allowed for this case and we wish to handle all ASCII characters
     * <p>
     * If a null or empty string is passed we will return false
     *
     * @param str The string to test - ASCII
     * @return True if all the characters are unique
     */
    public static boolean allCharsUniqueNoDataStruct(String str) {
        if (str == null || str.length() == 0 || str.length() > 255)
            return false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
