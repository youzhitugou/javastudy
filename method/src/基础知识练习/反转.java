package 基础知识练习;

public class 反转 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        int a = 0;
        for (int i = 0; i < arr.length/2; i++) {
            a = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
