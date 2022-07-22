package 基础知识练习;
import java.util.Scanner;
public class 小码哥的认可 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        long max = 0;
        int ans =0;
        int ans1 ;
        int num;
        for (long a = n-1; a > 2; a--) {
            long j = a;
            ans1 = 1;
            for (int i = 2; i*i <= j; i++) {
                num = 0;
                while(j % i ==0){
                    num++;
                    j = j / i;
                }
                if(num > 0){
                    num++;
                    ans1 = ans1*num;
                }
            }
            if(j > 1){
                ans1 = ans1*2;
            }
            if(ans < ans1){
                ans = ans1;
                max = a;
            }
        }
        System.out.println(max);
    }
}
