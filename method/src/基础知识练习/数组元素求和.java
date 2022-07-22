package 基础知识练习;
//有数组{68,27,95,88,171,996,51,210},求和，要求元素个位和十位不能是7且只能是偶数
public class 数组元素求和 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%10!=7 && arr[i]/10%10!=7 && arr[i]%2==0){
                sum += arr[i];
            }
        }
        System.out.println("满足要求的数组元素的和为：" + sum);
    }
}
