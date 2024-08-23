package pkg;

import DemoFilm.Movie;
import DemoFilm.MovieOperator;

public class Test {
    public static void main(String[] args) {
        //1、同一个包下的程序，可以直接访问。
        Demo d = new Demo();
        d.print();
        // 2、访问其他包下的程序，必须导包才可以访问。
        //3、自己的程序中调用Java提供的程序，也需要先导包才可以使用:注意:Java
        //4、访问多个其他包下的程序，这些程序名又一样的情况下，默认只能导入一个程序
    }
}
