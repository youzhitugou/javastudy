package 方法;

public class 带参方法练习 {
    public static void main(String[] args) {
        getMax(5,4);
    }
    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    public static void getMax(int a, int b){
        System.out.println(a>b? a:b);
    }

}
