package string;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "级你太美";
        //获取字符串的长度
        System.out.println(s.length());
        //根据索引提取字符
        char c = s.charAt(0);
        System.out.println(c);
        //字符串的遍历s.length().for回车
        for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("-----------------");
        //把字符串转换成字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        String s1 = new String("黑马");
        String s2 = new String("黑马");
        //判断字符串地址，一样的就返回ture
        System.out.println(s1==s2);
        //判断字符串内容，一样的就返回ture
        System.out.println(s1.equals(s2));

        //忽略大小写比较字符串内容
        String c1="jNtm";
        String c2="jNTM";
        System.out.println(c1.equalsIgnoreCase(c2));

        //截取字符串内容(包前补包后)
        String s3 = "蔡徐坤，及你太美";
        String rs = s3.substring(0,3);
        System.out.println(rs);

        //从当前位置截取字符串到结尾,选中就会出现右下角的char索引数
        String rs2 = s3.substring(3);
        System.out.println(rs2);

        //把字符串中某个内容替换成新的内容，并返回新的字符串对象
        String info = "我要给你发律师函，小黑子！！";
        String s4 = info.replace("小黑子","***");
        System.out.println(s4);

        //判断字符串有没有出现关机案子
        String info2 = "蔡徐坤，JI你太美";
        System.out.println(info2.contains("JI"));
        System.out.println(info2.contains("ji"));
        System.out.println(info2.contains("ji2"));

        //判断字符串是否以某个字符串开头
        String s6 = "蔡徐坤";
        System.out.println(s6.startsWith("蔡"));
        System.out.println(s6.startsWith("蔡666"));

        //分割字符串按照某个内容进行分割成多个字符串，放到一个字符串数组中返回我们
        String  s7 = "唱,跳,rap,篮球";
        String[] a = s7.split(",");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
