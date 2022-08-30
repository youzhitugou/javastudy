package 字符串;

import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int big = 0;
        int small = 0;
        int number = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(ch>='A' && ch<='Z'){
                big++;
            }else if(ch>='a' && ch<='z'){
                small++;
            }else if(ch>='0' && ch<='9'){
                number++;
            }
        }

        System.out.println("大写字母：" + big + "个");
        System.out.println("小写字母：" + small + "个");
        System.out.println("数字：" + number + "个");
    }
}
