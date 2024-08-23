package JavaBean;

//定义一个实体的学生类:只有get和set方法，为了数据和业务分离。
public class Student {
    private String name;
    private double score;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
