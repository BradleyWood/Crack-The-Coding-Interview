package ctci.ch20;

public class Problem1 {

    /**
     * Add without +/- operators
     * Same logic as full adder
     *
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        int sum = 0;
        byte carry = 0;
        for (int i = 0; i < 32; i++) {
            byte n1 = (byte) ((a >> i) & 1);
            byte n2 = (byte) ((b >> i) & 1);
            int gg = (sum(n1, n2, carry) << i);
            carry = (byte) carry(n1, n2, carry);
            sum |= gg;
        }
        return sum;
    }

    private static int sum(byte a, byte b, byte carry) {
        return (a ^ b) ^ carry;
    }

    private static int carry(byte a, byte b, byte carry) {
        return ((a ^ b) & carry) | (a & b);
    }
}
