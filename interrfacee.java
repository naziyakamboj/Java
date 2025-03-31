interface Animal {
    void makeSound();  
}

class Dog implements Animal {
    public void makeSound() {  
        System.out.println("Dog barks");
    }
}

public class interrfacee {
    public static void main(String[] args) {
        Animal myDog = new Dog();  
        myDog.makeSound(); 
    }
}
