public class AssignmentO {
    public static void main(String[] args) {
        // Declare variables
        int a = 10;
        int b = 5;

        // Basic Assignment (=)
        System.out.println("Basic Assignment (=):");
        System.out.println("a = " + a);  // Assign 10 to a
        System.out.println("b = " + b);  // Assign 5 to b

        // Compound Assignment: +=
        a += b;  // a = a + b
        System.out.println("\nCompound Assignment (+=):");
        System.out.println("a += b: " + a);  // a = 10 + 5 = 15

        // Compound Assignment: -=
        a -= b;  // a = a - b
        System.out.println("\nCompound Assignment (-=):");
        System.out.println("a -= b: " + a);  // a = 15 - 5 = 10

        // Compound Assignment: *=
        a *= b;  // a = a * b
        System.out.println("\nCompound Assignment (*=):");
        System.out.println("a *= b: " + a);  // a = 10 * 5 = 50

        // Compound Assignment: /=
        a /= b;  // a = a / b
        System.out.println("\nCompound Assignment (/=):");
        System.out.println("a /= b: " + a);  // a = 50 / 5 = 10

        // Compound Assignment: %=
        a %= b;  // a = a % b (remainder)
        System.out.println("\nCompound Assignment (%=):");
        System.out.println("a %= b: " + a);  // a = 10 % 5 = 0
    }
}
