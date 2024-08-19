package Animal;

public class Animal {

    abstract class Animall {
        public abstract void sing();
        public abstract void swim();
        public abstract void eat();
        public abstract void run();
    }

    class Dog extends Animall {
        @Override
        public void sing() {
            System.out.println("小狗叫");
        }

        @Override
        public void swim() {
            System.out.println("小狗游泳");
        }

        @Override
        public void eat() {
            System.out.println("小狗吃");
        }

        @Override
        public void run() {
            System.out.println("小狗跑");
        }
    }

    class Cat extends Animall {
        @Override
        public void sing() {
            System.out.println("小猫叫");
        }

        @Override
        public void swim() {
            System.out.println("小猫游泳");
        }

        @Override
        public void eat() {
            System.out.println("小猫吃");
        }

        @Override
        public void run() {
            System.out.println("小猫跑");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animall dog = animal.new Dog();
        dog.swim();
        dog.eat();
        dog.run();

        Animall cat = animal.new Cat();
        cat.swim();
        cat.eat();
        cat.run();
    }
}
