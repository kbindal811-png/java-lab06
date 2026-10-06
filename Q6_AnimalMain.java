abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}

public class Q6_AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}