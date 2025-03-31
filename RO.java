public class RO {
    public static void main(String[] args){
        int a = 10, b =20, c = 10;
        System.out.println("a==b:" + (a == b));
        System.out.println("a == c:" + (a == c));
        // Not equal to (!=)
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a != c: " + (a != c)); // false

        // Greater than (>)
        System.out.println("b > a: " + (b > a)); // true
        System.out.println("a > b: " + (a > b)); // false

        // Less than (<)
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("b < a: " + (b < a)); // false

        // Greater than or equal to (>=)
        System.out.println("b >= a: " + (b >= a)); // true
        System.out.println("a >= b: " + (a >= b)); // false

        // Less than or equal to (<=)
        System.out.println("a <= b: " + (a <= b)); // true
        System.out.println("b <= a: " + (b <= a)); // false
}
}
