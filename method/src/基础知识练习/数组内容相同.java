package 基础知识练习;

public class 数组内容相同 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        boolean x = compare(arr,arr2);
        System.out.println(x);
        
    }
    
    
    public static boolean compare(int[] arr, int[] arr2){
        if(arr.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    
}
