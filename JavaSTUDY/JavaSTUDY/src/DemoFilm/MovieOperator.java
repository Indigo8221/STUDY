package DemoFilm;

public class MovieOperator {

    private Movie[] movies;

    public MovieOperator(Movie[] movies)
    {
        this.movies = movies;
    }

    //展示系统全部信息
    public void printAllMovies()
    {

        System.out.println("------展示全部电影信息------");
        for(int i = 0; i< movies.length;i++)
        {
            Movie m = movies[i];
            System.out.println("电影名称："+m.getName());
            System.out.println("电影编号："+m.getId());
            System.out.println("电影价格："+m.getPrice());
        }
        System.out.println("--------------------------");
    }


    //根据id查询详细信息
    public void searchMovieById(int id)
    {

        for(int i = 0 ;i< movies.length;i++){
            Movie m = movies[i];
            if(m.getId()==id)
            {
                System.out.println("该电影详情如下");
                System.out.println("电影名称："+m.getName());
                System.out.println("电影编号："+m.getId());
                System.out.println("电影价格："+m.getPrice());
                System.out.println("电影得分："+m.getScore());
                return ;//已经找到了电影信息，没有必要再执行了
            }
        }
        System.out.println("没有这个电影信息");

    }
}
