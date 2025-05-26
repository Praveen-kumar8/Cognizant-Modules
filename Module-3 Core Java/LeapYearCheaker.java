import java.util.Scanner;
public class LeapYearCheaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int n =scan.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0)
                    System.out.println(n + " is a leap Year");
                
                else
                System.out.println(n + " is not a leap Year");
            }
            else
                System.out.println(n + " is a leap Year");
        }
            else
                System.out.println(n + " is not a leap Year");
    }
}
