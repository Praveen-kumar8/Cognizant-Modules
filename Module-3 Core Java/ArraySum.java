import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum = " +sum);
        System.out.println("Average = " + (double)sum/n);
    }
}
