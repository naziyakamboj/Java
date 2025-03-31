public class TerniaryO {
    public static void main(String[] args) {
        int a = 10, b = 20, age = 17;
        
        int max = (a > b) ? a : b;
        
        // Determine if the person is an adult or minor
        String status = (age >= 18) ? "Adult" : "Minor";
        
        // Check if a number is even or odd
        String evenOdd = (max % 2 == 0) ? "Even" : "Odd";
        
        // Print results
        System.out.println("Max value: " + max);
        System.out.println("Status: " + status);
        System.out.println("Max is: " + evenOdd);
    }
}
