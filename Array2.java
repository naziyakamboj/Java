// Q Sum of elements in the matrix
// public class Array2{
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int totalSum = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 totalSum += matrix[i][j];  
//             }
//         }

//         System.out.println("Sum of all elements in the matrix: " + totalSum);
//     }
// }
// Q *Calculate sum of each row
// public class Array2{
//     public static void main(String[] args) {

//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

        
//         for (int i = 0; i < matrix.length; i++) {
//             int sum = 0;  

            
//             for (int j = 0; j < matrix[i].length; j++) {
//                 sum += matrix[i][j];  
//             }

            
//             System.out.println("Sum of row " + (i + 1) + ": " + sum);
//         }
//     }
// }

// Q *Calculate sum of each column
// public class Array2{
//     public static void main(String[] args) {
       
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

        
//         calculateColumnSums(matrix);
//     }

//     public static void calculateColumnSums(int[][] matrix) {
        
//         for (int j = 0; j < matrix[0].length; j++) {
//             int sum = 0; 

            
//             for (int i = 0; i < matrix.length; i++) {
//                 sum += matrix[i][j]; 
//             }

            
//             System.out.println("Sum of column " + (j + 1) + ": " + sum);
//         }
//     }
// }

// Q Write a program to compute the transpose of 2-D Array.
// public class Array2{
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int[][] transpose = new int[cols][rows];

        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 transpose[j][i] = matrix[i][j];  
//             }
//         }

//         System.out.println("Original Matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Print the transposed matrix
//         System.out.println("\nTransposed Matrix:");
//         for (int i = 0; i < cols; i++) {
//             for (int j = 0; j < rows; j++) {
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// Q Write a program to add two 2-D array of same size and store result in array.
// public class Array2{
//     public static void main(String[] args) {
//         // Define two 3x3 matrices
//         int[][] matrix1 = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int[][] matrix2 = {
//             {9, 8, 7},
//             {6, 5, 4},
//             {3, 2, 1}
//         };

//         int[][] result = new int[3][3];

        
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }

//         // Print the result matrix
//         System.out.println("Result of Matrix Addition:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q Write a program to multiply two 2-D array of same size and store result in array.
// public class Array2{
//     public static void main(String[] args) {
        
//         int[][] matrix1 = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int[][] matrix2 = {
//             {9, 8, 7},
//             {6, 5, 4},
//             {3, 2, 1}
//         };

//         int[][] result = new int[3][3];

        
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 result[i][j] = matrix1[i][j] * matrix2[i][j];
//             }
//         }

        
//         System.out.println("Result of Matrix Multiplication:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Array2{
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int target = 5;
        
//         String result = search2DArray(arr, target);
//         System.out.println(result);
//     }
    
//     public static String search2DArray(int[][] arr, int target) {
        
//         for (int i = 0; i < arr.length; i++) {
            
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] == target) {
//                     return "Found at row " + i + ", column " + j;
//                 }
//             }
//         }
//         return "No result found"; 
//     }
// }


