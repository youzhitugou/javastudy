package debug;

public class debug查看偶数求和 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("1-10之间的偶数和是"+ sum);
    }
}
