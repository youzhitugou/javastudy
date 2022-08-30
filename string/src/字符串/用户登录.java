package 字符串;
//已知用户名和密码，实现模拟登录
import java.sql.SQLOutput;
import java.util.Scanner;
public class 用户登录 {
    public static void main(String[] args) {
        String username = "可莉";
        String password = "dudu";

        for(int i=0; i<3; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败，你还有"+(2-i)+"次机会");
            }
        }
    }

}
