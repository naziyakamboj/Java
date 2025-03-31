// public class Inverted {
//     public static void main(String args[]){
//         for(int i = 5 ;i>=1;i--){
//             for(int j =1; j<=i; j++){
//                 System.out.print(i);
//                     }
//                     System.out.println();
//                 }
//             }
// }
// public class Inverted{
//     public static void main(String args[]) {
//         int n = 5; 

        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }
// public class Inverted{
//     public static void main(String args[]) {
//         int n = 5; 

        
//         for (int i = 1; i <= n; i++) {
//             // Inner loop to print spaces before the stars
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");  // Print space
//             }

//             // Inner loop to print stars
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");  // Print star
//             }

//             // Move to the next line after each row
//             System.out.println();
//         }
//     }
// }
// public class Inverted{
//     public static void main(String args[]) {
//         int n = 5; 

        
//         for (int i = n; i >=1; i--) {
//             // Inner loop to print spaces before the stars
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");  // Print space
//             }

//             // Inner loop to print stars
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");  // Print star
//             }

//             // Move to the next line after each row
//             System.out.println();
//         }
//     }
// }
// public class Inverted{
//         public static void main(String args[]) {
//             int n = 5; 
//             for (int i = 1; i <= n; i++) {
//                 // Inner loop to print spaces before the stars
//                 for (int j = 1; j <= n - i; j++) {
//                     System.out.print(" ");  // Print space
//                 }
    
//                 // Inner loop to print stars
//                 for (int j = 1; j <= (2 * i - 1); j++) {
//                     System.out.print("*");  // Print star
//                 }
//                 System.out.println();
//             }
//             for (int i = n; i >= 1; i--) {
//                             // Inner loop to print spaces before the stars
//                 for (int j = 1; j <= n - i; j++) {
//                     System.out.print(" ");  // Print space
//                             }
                
//                             // Inner loop to print stars
//                 for (int j = 1; j <= (2 * i - 1); j++) {
//                     System.out.print("*");  // Print star
//                             }
//                             System.out.println();
//             }
//         }
//     }
public class Inverted{
    public static void main(String[] args) {
        int n = 5; 
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for borders and ' ' for hollow space in the middle
                if (i == 1 || i == n  || j == 1 || j == n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}








