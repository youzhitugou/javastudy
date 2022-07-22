import java.util.Scanner;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        } // code here
        int[] sum = new int[n];
        int sum1 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                sum[n-i-1] += (j+1)*arr[n-j-1];
            }
        }
        for(int i=0; i<n; i++){
            sum1 += sum[i];
        }
        System.out.println(sum1);
        input.close();
    }
}