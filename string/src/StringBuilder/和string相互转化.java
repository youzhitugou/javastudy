package StringBuilder;

public class 和string相互转化 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        String s = sb.toString();
        System.out.println(s);

        String s1 = "hello";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
