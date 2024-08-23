package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.swim();
        animal1.eat();
        animal1.run();

        animal2.swim();
        animal2.eat();
        animal2.run();
    }
}
