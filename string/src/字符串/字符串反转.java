package 字符串;
import java.util.Scanner;
public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println("反转后的字符串为：" + s);
    }

    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }

}
