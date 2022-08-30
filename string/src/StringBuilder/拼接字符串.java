package StringBuilder;

public class 拼接字符串 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3};
        String s = connect(arr);
        System.out.println("拼接的字符串为：" + s);

    }

    public static String connect(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}


