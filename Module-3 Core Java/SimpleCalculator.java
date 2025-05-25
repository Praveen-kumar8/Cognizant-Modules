import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Enter Your Operation: + - * /");
        char x = scan.next().charAt(0);
        switch(x){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
            if(b!=0)
                System.out.println(a/b);
            else
                System.out.println("Cannot divide by Zero");
            break;
            default :
                System.out.println("Invalid Operation");
                break;
        }
    }   
}
