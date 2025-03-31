public class BO {
    public static void main(String[] args) {
        int a = 60;   // 60 = 0011 1100 in binary
        int b = 13;   // 13 = 0000 1101 in binary

        // AND Operator (&)
        System.out.println("Bitwise AND (&):");
        System.out.println("a & b = " + (a & b));  // Result: 12 (0000 1100)

        // OR Operator (|)
        System.out.println("\nBitwise OR (|):");
        System.out.println("a | b = " + (a | b));  // Result: 61 (0011 1101)

        // XOR Operator (^)
        System.out.println("\nBitwise XOR (^):");
        System.out.println("a ^ b = " + (a ^ b));  // Result: 49 (0011 0001)

        // Complement (~)
        System.out.println("\nBitwise Complement (~):");
        System.out.println("~a = " + (~a));  // Result: -61 (~0011 1100 = 1100 0011)
        System.out.println("~b = " + (~b));  // Result: -14 (~0000 1101 = 1111 0010)

        // Left Shift (<<)
        System.out.println("\nLeft Shift (<<):");
        System.out.println("a << 2 = " + (a << 2));  // Shift left by 2 positions, Result: 240 (1111 0000)

        // Right Shift (>>)
        System.out.println("\nRight Shift (>>):");
        System.out.println("a >> 2 = " + (a >> 2));  // Shift right by 2 positions, Result: 15 (0000 1111)

        // Unsigned Right Shift (>>>)
        System.out.println("\nUnsigned Right Shift (>>>):");
        System.out.println("a >>> 2 = " + (a >>> 2));  // Shift right by 2 positions, Result: 15 (0000 1111)
    }
}
