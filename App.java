import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int guessNum;
        int tries = 0;
        
        int correctNum = (int) (Math.random() * 9) + 1; 
        //(int) (Math.random() * (max - min)) + min;
        
        boolean win = false;

        while (win == false) {
         System.out.print("Guess a number between 1 to 10: ");
         guessNum = input.nextInt();
         tries ++;

         if (guessNum == correctNum) {
         win = true;
         }
         else if (guessNum <= correctNum) {
         System.out.println("Your guess is too low!");
         }
         else if (guessNum >= correctNum) {
         System.out.println("Your guess is too high!");
         }
        }
        System.out.println("You Win!");
        System.out.println("The number was " + correctNum + ".");
        System.out.println("It took you " + tries + " tries.");
    }

}
