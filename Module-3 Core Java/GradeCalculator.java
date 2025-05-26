import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int m = scan.nextInt();
        if(m>=90&&m<=100)
        System.out.println("A Grade");
        else if(m>=80&&m<90)
        System.out.println("B Grade");
        else if(m>=70&&m<80)
        System.out.println("C Grade");
        else if(m>=60&&m<70)
        System.out.println("D Grade");
        else if(m<60)
        System.out.println("FGrade");
    }
}
