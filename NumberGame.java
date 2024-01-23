import java.util.*;

public class NumberGame{

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;


    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int total_score = 0;

        System.out.println("Number Gussing Game");
        System.out.println("Total Number of Rounds = "+ MAX_ROUNDS);
        System.out.println("Attempts To Guess Number In Each Round = "+ MAX_ATTEMPTS);
        for(int i=1; i<=MAX_ROUNDS; i++){
            int Number = rand.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;

            System.out.printf("Round %d: Guess The Number between %d and %d in %d attempts.\n" , i,MIN_RANGE , MAX_RANGE , MAX_ATTEMPTS);
            while ((attempts<MAX_ATTEMPTS)) {
                System.out.println("Enter your Guess Number = ");
                int guess_number = sc.nextInt();
                attempts += 1;

                if(guess_number == Number){
                    int score =  MAX_ATTEMPTS - attempts;
                    total_score += score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Random Score = %d \n", attempts , score);
                    break;

                }
                else if(guess_number < Number){
                    System.out.printf("The number is greater than %d. Attempts left = %d. \n" , guess_number , MAX_ATTEMPTS-attempts);

                }

                else if(guess_number > Number){
                    System.out.printf("The number is Less than %d. Attempts left = %d. \n" , guess_number , MAX_ATTEMPTS-attempts);

                }
            }

            if(attempts == MAX_ATTEMPTS){
                System.out.printf("Round = %d", i);
                System.out.println("\nAttempts = 0");
                System.out.printf(" \nThe Random Number Is : %d", Number);
            }

        }

        System.out.println("Game Over. Total Score = %d"+ total_score);
    }
}