public class LO {
    public static void main(String[] args){
        // Initialize variables
        int a = 10, b = 5, c = 20;
        boolean x = true, y = false;

        // AND Operator (&&)
        System.out.println("AND Operator (&&):");
        System.out.println("x && y: " + (x && y)); // false (because y is false)
        System.out.println("a > b && b < c: " + (a > b && b < c)); // true (both conditions are true)

        // OR Operator (||)
        System.out.println("\nOR Operator (||):");
        System.out.println("x || y: " + (x || y)); // true (because x is true)
        System.out.println("a > b || b > c: " + (a > b || b > c)); // true (first condition is true)

        // NOT Operator (!)
        System.out.println("\nNOT Operator (!):");
        System.out.println("!x: " + (!x)); // false (x is true, so !x is false)
        System.out.println("!y: " + (!y)); // true (y is false, so !y is true)

        // Combining logical operators
        System.out.println("\nCombining Logical Operators:");
        System.out.println("!(a > b && b < c): " + !(a > b && b < c)); // false (negation of true)
        System.out.println("!(a < b || b > c): " + !(a < b || b > c)); // true (negation of false)    
    }
}
