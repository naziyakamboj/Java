//3. You need to create a Temperature Converter class that supports converting between Celsius, Fahrenheit, and Kelvin. How will you implement method overloading for this?

// public class overloading{  
//     public static void main(String[] args){
//         Child myChild = new Child(); 
//         myChild.display();
//         myChild.show();
//     }
// }

// class Parent {
//     int num = 100;

//     void show() {
//         System.out.println("This is the parent class");
//     }
// }

// class Child extends Parent {
//     void display() {
//         System.out.println("This is the child class");
//     }
// }
public class overloading{
    public static void main(String[] args){
            Dog naziya = new Dog();
            naziya.bark();
            naziya.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}