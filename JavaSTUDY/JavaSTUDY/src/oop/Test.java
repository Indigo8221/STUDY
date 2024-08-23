package oop;

public class Test {
    public static void main(String[] args) {
        //面向对象快速编程
        //1.创建一个学生对象，封装s1的数据
        Student s1 = new Student();
        s1.name = "朱同学";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();
        //2.再创建一个学生对象，封装s2的数据‘
        Student s2 = new Student();
        s2.name = "嘉同学";
        s2.chinese = 66;
        s2.math = 77;
        s2.printAverageScore();
        s2.printAverageScore();

        System.out.println(s1);
        System.out.println(s2);
    }
}
