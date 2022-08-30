package StringBuilder;
import java.util.Scanner;
public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = Reverse(line);
        System.out.println("字符串反转后为：" + s);

    }

    public static String Reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
