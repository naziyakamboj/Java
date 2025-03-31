// Question :- Find the sum of array
// import java.util.Scanner;

// public class Arraysum{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt(); 
        
        
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         System.out.println("The sum from 1 to " + n + " is: " + sum);
        
//         scanner.close();

//     }
// }
// Question :- Find Largest number of array
// public class Arraysum{
//     public static void main(String[] args) {
//         int[] numbers = {23, 5, 76, 12, 89, 34, 90}; 

//         int largest = numbers[0];

//         for (int i = 1; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i]; 
//             }
//         }
//         System.out.println("The largest number is: " + largest);
//     }
// }
// Question :- Print reverse the array
// public class Arraysum{

//     public static void main(String[] args) {
//         int[] numbers = {23, 5, 76, 12, 89, 34, 90}; 

        
//         System.out.println("Reversed array:");
//         for (int i = numbers.length - 1; i >= 0; i--) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }
// Question :- Search element of array
public class Arraysum{

    public static void main(String[] args) {
        int[] numbers = {23, 5, 76, 12, 89, 34, 90}; 
        int target = 76; 

        // Loop through the array to search for the element 
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}




