import java.util.*;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println("Factorial: " + fact);
    }
}
