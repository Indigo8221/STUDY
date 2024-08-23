package JavaBean;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("朱同学");
        student1.setScore(66);
        System.out.println(student1.getName());
        System.out.println(student1.getScore());

        StudentOperator operator = new StudentOperator(student1);
        operator.printPass();
    }
}
