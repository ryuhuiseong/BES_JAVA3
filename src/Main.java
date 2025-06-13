abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz... 자는중...");
    }
}

interface Flyable {
    void fly();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍머엄어멍머어!");
    }
}

class Bird extends Animal implements Flyable {}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal Bird = new Bird();

        dog.makeSound();
        dog.sleep();
    }
}

