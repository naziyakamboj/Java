// import java.util.StringTokenizer;
// public class StringTokenizerExample {
//     public static void main(String[] args){
//         StringTokenizer str = new StringTokenizer("apple, banana, orange,grapes", ",");
//         System.out.println(str.countTokens());
//         System.out.println(str.nextToken());
//         while(str.hasMoreTokens()){
//             System.out.println(str.nextToken());
//         };
//     }
// }
// import java.util.StringTokenizer;
// public class StringTokenizerExample {
//     public static void main(String[] args){
//         StringTokenizer str = new StringTokenizer("i love programming in java");
//         System.out.println(str.countTokens());
//     }}
// import java.util.StringTokenizer;
// public class StringTokenizerExample {
//     public static void main(String[] args){
//         StringTokenizer str = new StringTokenizer("apple, orange; banana", ",");
//         while(str.hasMoreTokens()){
//             System.out.println(str.nextToken());
//     }}
// }
// import java.util.StringTokenizer;

// public class StringTokenizerExample {
//     public static void main(String[] args) {
//         StringTokenizer tokenizer = new StringTokenizer("Naziya is beautiful");
        
//         System.out.println("Number of tokens: " + tokenizer.countTokens());
//     }
// }
// import java.util.StringTokenizer;

// public class StringTokenizerExample {
//     public static void main(String[] args) {
//         StringTokenizer tokenizer = new StringTokenizer("Java is fun");
        
        // System.out.println("Number of tokens: " + tokenizer.countTokens());
        // OR
//         while(tokenizer.hasMoreTokens()){
//             System.out.println(tokenizer.nextToken());
//         }
//     }
// }
// create a Java program that performs the following:
// 1. Accepts a comma-separated string of numbers(e.g. "12, 3, 56, 78, 90") as input
// 2. Use StringTokenizer to split the string into individual numbers.
// 3.Use StringBuffer to reverse each number.
// 4.Append all the reversed numbers into a single string using StringBuilder , with a space between them.
// 5. Print the final result.


// import java.util.StringTokenizer;

// public class StringTokenizerExample {
//     public static void main(String[] args) {
//         String inp = "12, 34, 56, 78, 90";

//         StringTokenizer str = new StringTokenizer(inp, ",");

//         StringBuilder result = new StringBuilder();
//         while(str.hasMoreTokens()){
//             String line = new String(str.nextToken());
//             StringBuffer reverseLine = new StringBuffer(line);
//             result.append(reverseLine.reverse() + " ");
//         }
//         System.out.println(result);
//     }
// }

// import java.util.StringTokenizer;

// public class StringTokenizerExample{
//     public static void main(String[] args) {
//         StringTokenizer str = new StringTokenizer("I love programming in Java",",");
//         StringBuilder result = new StringBuilder();

//         while(str.hasMoreTokens()){
//             String number = str.nextToken();
//             StringBuffer reversedWord = new StringBuffer(number).reverse();
//             result.append(reversedWord.toString().toUpperCase()).append(" ");
//         }                 
//         System.out.println("Final result: " + result.toString());
//     }
// }

// Take a str input from the user containing multiple sentences separated by periods(.)
// Split the input into individual sentences using StringTokenizer
// for each sentence:
// Reverse the order of words (not the characters) using StringBuilder.
// Combine all the modified sentences into a single string 
// return the final modified string to the user
// import java.util.*;

// public class StringTokenizerExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter sentences separated by periods:");
//         String input = scanner.nextLine();
 
//         StringTokenizer sentences = new StringTokenizer(input, ".");
//         StringBuilder result = new StringBuilder();

//         while (sentences.hasMoreTokens()) {
//             StringTokenizer words = new StringTokenizer(sentences.nextToken().trim(), " ");
//             StringBuilder reversedSentence = new StringBuilder();
//             while (words.hasMoreTokens()) {
//                 reversedSentence.insert(0, words.nextToken() + " ");
//             }
//             result.append(reversedSentence.toString().trim()).append(". ");
//         }

//         System.out.println("Final result: " + result.toString().trim());
//         scanner.close();
//     }
// }




