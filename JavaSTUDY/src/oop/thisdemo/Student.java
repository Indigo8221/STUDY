package oop.thisdemo;

public class Student {

    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        if(this.score > score)
        {
            System.out.println("恭喜你考上了母猪产后护理专业");
        }else{
            System.out.println("很遗憾，你落榜了");
        }

    }
}
