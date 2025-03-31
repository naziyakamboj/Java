class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("Mammal walk.");
    }
}
class Dog extends mammal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class multilevel{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
