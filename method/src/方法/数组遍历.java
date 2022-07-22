package 方法;

public class 数组遍历 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        op(arr);
    }

    public static void op(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
