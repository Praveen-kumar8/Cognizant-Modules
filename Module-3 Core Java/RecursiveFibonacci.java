import java.util.*;
public class RecursiveFibonacci {

    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        if (n<0){
            System.out.println("Please enter Positive Num.");
        } else {
            int res = fibo(n);
            System.out.println("Fibonacci of " + n + " : " + res);
        }
    }
}
