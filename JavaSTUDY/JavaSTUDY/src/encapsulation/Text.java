package encapsulation;

public class Text {
    public static void main(String[] args) {
        //封装的设计规范，目标：合理隐藏，合理暴露
        Student s1 = new Student();
        s1.setScore(-1);
        System.out.println(s1.getScore());
    }
}
