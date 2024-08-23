package DemoFilm;

//目标:充成电影信息展示功能;根据电影id查询该电影详情。
//电影数据:
//1,"水门桥"，38.9，9.8，“徐克"，“吴京”,“12万人想看"
//2，“出拳吧”，39，7.8，“唐晓白”，“田雨","3.5万人想看”
//3,"月球陨落"，42，7.9，“罗兰”，“贝璘","17.9万人想看"
//4,"一点就到家”，35，8.7，“许宏字"，“刘昊然”,"10.8万人想看"

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.设计一个电影类
        //2.设计一个电影的操作类
        Movie[] movies = new Movie[4];
        //在这里一定要把数组中的位置都填满，不然回遇到空指针异常（下面的报错）@_@...
        //Exception in thread "main" java.lang.NullPointerException
        //at Demo.MovieOperator.printAllMovies(MovieOperator.java:18)
        //at Demo.Test.main(Test.java:24)
        movies[0] = new Movie(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1] = new Movie(2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看");
        movies[2] = new Movie(3,"月球",42,7.9,"罗兰","贝璘","17.9万人想看");
        movies[3] = new Movie(4,"点就到家",35,8.7,"许宏字","刘昊然","10.8万人想看");
        //Ctrl+D复制上一行代码

        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchMovieById(2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id进行某个电影信息展示");
            int command = sc.nextInt();
            switch (command)
            {
                case 1:
                    operator.printAllMovies();
                case 2:
                    System.out.println("输入查询电影id");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                default:
                    System.out.println("输入的命令有问题");
            }
        }

    }
}
