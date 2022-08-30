package StringBuilder;

public class 添加和反转方法 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //public StringBuilder append(任意类型） : 添加数据，并返回对象本身
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);

        sb.append("world");
        sb.append("java");

        sb2.append("world").append("java");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);

        StringBuilder sb3 = sb.reverse();
        System.out.println("sb3:" + sb3);
    }
}
