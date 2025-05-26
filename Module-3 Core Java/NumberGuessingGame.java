import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randnum = rand.nextInt(100) + 1; 
        int guess = scan.nextInt();

        while(guess != randnum) {
            if(guess < randnum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            guess = scan.nextInt(); 
        }
        System.out.println("Congratulations! You've guessed the number: " + randnum);
    }
}
