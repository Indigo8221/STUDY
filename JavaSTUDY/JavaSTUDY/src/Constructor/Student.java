package Constructor;

public class Student {
    String name;
    double score;
    //无参构造器
    public Student() {
        System.out.println("无参数构造器");
    }

    //有参构造器
    public Student(String name, double score) {
        System.out.println("有参数构造器被执行了");
    }
}
