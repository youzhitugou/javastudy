package 基础知识练习;

public class 不死神兔 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(arr[19]);
    }
}
