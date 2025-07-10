import java.util.Random;
import java.util.Scanner;

public class WordGuesserApp {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        char[] blanks = new char[word.length()];
        for (int i = 0; i < blanks.length; i++) {
            blanks[i] = '_';
        }

        int lives = 5;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Word: " + new String(blanks));
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    blanks[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                lives--;
                System.out.println("Incorrect guess. Lives remaining: " + lives);
            }

            if (new String(blanks).equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                break;
            }

            if (lives == 0) {
                System.out.println("Game Over! The word was: " + word);
                break;
            }
        }

        scanner.close();
    }
}