package 基础知识练习;
import java.util.Scanner;
//已知数组，键盘录入一个数据，查找该数据在数组中的索引
public class 查找 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入要查找的数据：" );
        int number = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

}
