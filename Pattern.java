public class Pattern {
    public static void main(String args[]){
        for(int i = 0 ; i<5 ;i++){
            for(int j =0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// public class Pattern{
//     public static void main(String args[]){
//         // int rows = 4;
//         for(int i=0; i<5; i++){
//             for(int j = 0; j <i; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;

// public class Pattern{
//     public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the number of rows:");
//            int rows = sc.nextInt();
        
//         for (int i = 1; i <= rows; i++) {
//             if (i > 5) { 
//                 break;
//             }

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i); 
//             }

//             System.out.println(); 
//         }

//         sc.close(); 
//     }
// }

