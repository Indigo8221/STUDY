package Animal;

class Dog extends Animal {
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

