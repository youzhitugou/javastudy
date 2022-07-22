package array;

public class 动态初始化 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[3];
       /* //输出数组名
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr[0] = 100;
        arr2[0] = 200;
        arr2[2] = 300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
