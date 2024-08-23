package Constructor;

public class Text {
    public static void main(String[] args) {
    Student s = new Student("朱同学",90);

    Student s1 = new Student();
    s1.name = "嘉同学";
    s1.score = 100;

    Student s2 = new Student("琪同学",66);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
//#构造器在哪里调用，我们常用它来干嘛?
//对象创建时，我们可以指定对象去调用哪个构造器执行。
//#构造器常用于完成对象初始化(常见的应用场景是完成对象的成员变量的初始化赋值3.构造器在使用时，有哪2个注意事项?
//类在设计时，如果不写构造器，Java会为类自动生成一个无参构造器的一旦定义了有参构造器，Java就不会帮我们的类生成无参构造器了，此时就建议自己手写一个
