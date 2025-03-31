// import java.util.*;

// public class arrayie {
//     public static void main(String[] args){
//         // 1. Sort the array in ascending order without using any built-in sorting functions

//         int[] arr = {12, 7, -5, 9 , 20, -3, 15, 8};
//         Arrays.sort(arr);
//         System.out.println("Sorted array:" + Arrays.toString(arr));
//         // 2. Find the second smallest and second largest elements in the array
//         int secondSmallest = arr[1];
//         int secondLargest = arr[arr.length - 2];
//         System.out.println("Second Smallest: "+ secondSmallest + " Second Largest: "+ secondLargest);
//         // 3. Reverse the array and print the reversed array
//         int[] reversedArr = new int[arr.length];
//         for(int i = 0; i<arr.length; i++){
//             reversedArr[i] = arr[arr.length - 1 - i];
//         }
//             System.out.println("Reversed array:" + Arrays.toString(reversedArr));
//         // 4. Count the number of positive and negative numbers in the array
//         int positiveCount = 0 , negativeCount =0;
//         for(int num: arr){
//         if(num > 0) positiveCount++;
//         else if(num < 0) negativeCount++;
//         }
//         System.out.println("Positive Numbers:" + positiveCount + "Negative numbers:" + negativeCount);
//         // 5. Create a new array that contains only the even numbers from the original array and print it
//         List<Integer> evenNumbers = new ArrayList<>();
//         for(int num : arr){
//             if(num % 2 == 0) evenNumbers.add(num);
//         }
//         System.out.println("Even Numbers" + evenNumbers);
//     }
// }

// import java.util.Scanner;

// public class arrayie{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of rows:");
//         int rows = sc.nextInt();
//         System.out.print("Enter the number of columns:");
//         int cols = sc.nextInt();

//         int[][] matrix = new int[rows][cols];
//         System.out.println("Enter the number of matrix elements:");
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols;j++){
//                 matrix[i][j]= sc.nextInt();
//             }
//         }
//         //print the transpose of a matrix
//         System.out.println("Transpose of the matrix:");
//         for(int i=0; i<cols; i++){
//             for(int j=0; j<rows; j++){
//                 System.out.print(matrix[j][i]+ " ");
//             }
//             System.out.println();
//         }
// // Check if the matrix is symmetric
// boolean isSymmetric = true;
// if (rows == cols){
//     for(int i = 0; i < rows; i++){
//         for(int j = i; j< cols; j++){
//             if(matrix[i][j] != matrix[j][i]){
//                 isSymmetric = false;
//                 break;
//             }
//         }
//     }
// } 
//     else{
//             isSymmetric = false;
//         }
//         System.out.println("Is the matrix symmetric?" + isSymmetric);
//         //Calculate and print the sum of all elements
//         int sum = 0;
//         for(int i=0; i < rows; i++){
//             for(int j = 0; j < rows; j++){
//                 sum += matrix[i][j];
//             }
//         }
//         System.out.println("Sum of all elements: "+ sum);
//     // 4. Find the maximum and minimum values in the matrix and their positions
//     int max = matrix[0][0], min = matrix[0][0];
//     int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;
//     for(int i=0; i<rows; i++){
//         for(int j=0; j<cols;j++){
//             if(matrix[i][j] > max){
//                 max = matrix[i][j];
//                 maxRow=i;
//                 maxCol =j;
//             }
//             if(matrix[i][j]<min){
//                 min = matrix[i][j];
//                 minRow = i;
//                 minCol = j;
//             }

//         }
//     }
//     System.out.println("Maximum value:"+ max + "at position ("+ maxRow + "," + maxCol+")");
//     System.out.println("Minimum value:"+ min + "at position ("+ minRow + "," + minCol+")");
// }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayie{
    public static void main(String[] args){
        //Create an array of integers using user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Enter the odd and even array
        List<Integer> odd = new ArrayList<>() , even = new ArrayList<>();
        // Sorting
        System.out.println("Enter elements:");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) even.add(arr[i]);
                else odd.add(arr[i]);
            }
            System.out.println("Odd Numbers: " + odd);
            System.out.println("Even numbers:" + even);

            Collections.sort(odd);
            Collections.sort(even);
            
            odd.addAll(even);

            System.out.println("Final Merged Array: "+ odd);
            sc.close();
        }
    }
