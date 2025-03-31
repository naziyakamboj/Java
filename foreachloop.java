// public class foreachloop {
//     public static void main(String args[]){
//         int[] numbers = {1, 2, 3, 4, 5};

//         for (int num : numbers) {
//             System.out.println(num);
//         } 
//     }
// }
import java.util.ArrayList;

public class foreachloop {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


