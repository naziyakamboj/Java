public class overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls method from Animal class

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls overridden method from Dog class
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound() method
    //@Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

