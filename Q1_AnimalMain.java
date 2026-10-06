class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Q1_AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}