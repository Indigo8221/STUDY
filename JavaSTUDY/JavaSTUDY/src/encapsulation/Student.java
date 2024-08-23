package encapsulation;

public class Student {
    private double score;

    //给score赋值，为了防止赋值不合法score，所以用setscore
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("数据非法");
        }
    }

    public double getScore() {
        return score;
    }

}
