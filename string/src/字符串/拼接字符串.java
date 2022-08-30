package 字符串;

public class 拼接字符串 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s1 = connect(arr);
        System.out.println("拼接后的字符串为：" + s1);

    }

    public static String connect(int[] arr){
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }


}
