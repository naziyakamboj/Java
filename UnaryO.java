public class UnaryO {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Unary Plus (+)
        System.out.println("Unary Plus (+):");
        System.out.println("a = " + a);  // No change, a remains 10

        // Unary Minus (-)
        System.out.println("\nUnary Minus (-):");
        System.out.println("-a = " + (-a));  // Negate a, result is -10

        // Increment Operator (++)
        System.out.println("\nIncrement Operator (++):");
        System.out.println("Pre-increment: ++a = " + (++a));  // a is incremented before use, a becomes 11
        System.out.println("Post-increment: b++ = " + (b++));  // b is used before increment, b becomes 6 after the line
        System.out.println("b after post-increment: " + b);  // Now b is 6

        // Decrement Operator (--)
        System.out.println("\nDecrement Operator (--):");
        System.out.println("Pre-decrement: --a = " + (--a));  // a is decremented before use, a becomes 10
        System.out.println("Post-decrement: b-- = " + (b--));  // b is used before decrement, b becomes 5 after the line
        System.out.println("b after post-decrement: " + b);  // Now b is 5

        // Logical NOT (!)
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical NOT (!):");
        System.out.println("!x = " + !x);  // Reverses the value of x, result is false
        System.out.println("!y = " + !y);  // Reverses the value of y, result is true
    }
}

