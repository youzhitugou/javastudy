package 方法;
import java.util.Scanner;
public class 数组最大值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        getMax(arr);
    }
    public static void getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            max = arr[i]>max ? arr[i]:max;
        }
        System.out.println("最大值为" + max);
    }
}
