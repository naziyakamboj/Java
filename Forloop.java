import java.util.Scanner;

public class Forloop{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a new number");
    int num = sc.nextInt();
    for(int i=0; i< num; i++){
        System.out.println(i);
    }
    sc.close();
}
}
