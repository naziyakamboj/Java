//Create a class in java to create an array with n element . Enter a number to search the element whether it exist or not if exist display the index of the element 
// public class Array {
//     public static void main(String args[])
// }

// public class Array{
//     public static void main(String[] args){
//         int[] numbers;
//         numbers = new int[5];
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;
//         for(int i =0; i< numbers.length; i++){
//             System.out.println("Element at index" + i + ": " + numbers[i]);
//         }
//     }
// }
// import java.util.Scanner;

// public class Array{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an index (between 1 and 100): ");
//         int index = scanner.nextInt();
        
//         // Check if the index is within the valid range
//         if (index < 1 || index > 100) {
//             System.out.println("Error: Index should be between 1 and 100.");
//         } else {
//             // Create an array of size 100
//             int[] numbers = new int[100];
//             for (int i = 0; i < 100; i++) {
//                 numbers[i] = i + 1; // Fill the array with numbers from 1 to 100
//             }

//             // Print numbers from 1 to the user-provided index
//             System.out.println("Array elements between 1 and " + index + ":");
//             for (int i = 0; i < index; i++) {
//                 System.out.print(numbers[i] + " ");
//             }
//             System.out.println(); // Print a newline after the array output

//             // Calculate the sum of even numbers within the range of 1 to 100
//             int evenSum = 0;
//             for (int i = 0; i < 100; i++) {
//                 if (numbers[i] % 2 == 0) {
//                     evenSum += numbers[i];
//                 }
//             }

//             // Output the sum of even numbers
//             System.out.println("Sum of even numbers between 1 and 100: " + evenSum);
//         }
        
//         scanner.close();
//     }
// }
// public class Array{
//         public static void main(String[] args){
//             int x[]={1,2,3};
//             int len = x.length;
//             System.out.println("length is "+ len*Integer.BYTES);
//         }}
// Q - Want to print the newValue = 70 at index 9
// public class Array{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50, 60};
//         int index = 9; 
//         int newValue = 70;
        
//         if (index >= 0 && index <= arr.length) {
//             // Create a new array with one extra space
//             int[] newArr = new int[index + 1];  // New array size is index + 1

//             // Copy elements from the original array to the new array
//             for (int i = 0; i < arr.length; i++) {
//                 newArr[i] = arr[i];
//             }

//             // Insert the new value at the specified index
//             newArr[index] = newValue;

//             // Print the updated array
//             System.out.println("Updated array: ");
//             for (int i = 0; i < newArr.length; i++) {
//                 System.out.print(newArr[i] + " ");
//             }
//         } else {
//             System.out.println("Invalid index.");
//         }
//     }
// }

import java.util.StringTokenizer;

public class Array{
        public static void main(String[] args) {
            StringTokenizer str = new StringTokenizer("this is StringTokenizer");
            // System.out.println(str.hasMoreTokens());
            // System.out.println(str.nextToken());
            // System.out.println(str.nextToken());
            // System.out.println(str.hasMoreTokens());
            // System.out.println(str.nextToken());
            // System.out.println(str.hasMoreTokens());
            System.out.println(str.countTokens());
        }
    }

