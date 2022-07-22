package array;

public class 静态初始化 {
    public static void main(String[] args) {
        int[] arr = {12,45,98,73,60};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i]:max;
        }
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] :min;
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
