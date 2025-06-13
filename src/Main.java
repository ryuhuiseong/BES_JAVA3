interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void makeLoud() {
        System.out.println("으르르깡깡");
    }
}





public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.makeSound();

        if (dog instanceof Dog){
            Dog newdog = new Dog();

            newdog.makeLoud();
        }
    }
}