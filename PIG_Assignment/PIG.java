import java.util.Scanner;

public class PIG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the PIG game!");
        int playerScore = 0;
        int turn = 1;
        do {
            System.out.println("Turn : "+turn);
            turn++;
            char choice;
            int diceRoll = 0;
            do{
                if(playerScore >= 20) {
                System.out.println("Congratulations! You reached 20 points and won the game!");
                break;
                }
                System.out.println("Choose Roll or Hold (r/h):");
                 choice = scanner.next().charAt(0);
            if (choice == 'r' || choice == 'R') {
                 diceRoll = (int) (Math.random() * 6) + 1;
                 System.out.println("You rolled a " + diceRoll);
                if(!(diceRoll == 1)){
                    playerScore += diceRoll;
                }else {
                    playerScore = 0;
                    System.out.println("Turn over!");
                    break;
                }
            }else if (choice == 'h' || choice == 'H') {
                System.out.println("You chose to hold. Your final score is: " + playerScore);
                break;
            } else {
                System.out.println("Invalid choice. Please choose 'r' to roll or 'h' to hold.");
            }
            }while(choice != 'H' || choice != 'h' || diceRoll != 1);
            System.out.println("Current score: " + playerScore + " in this turn.");
            
        } while (turn <= 5);
        scanner.close();
    }
}
