import java.util.Scanner;

public class Guess {
    public String get_guess(String bad_guesses, String good_guesses){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Guess a letter:   ");
            String guess = input.nextLine().toLowerCase();
            System.out.println("");
            if (guess.length() != 1){
                System.out.println("You can only guess a single letter!");
            } else
            if ((good_guesses.contains(guess)) || (bad_guesses.contains(guess)) ){
                System.out.println("You've already guessed that letter!");
            } else
            if (! guess.matches("[a-zA-Z]+")){
                System.out.println("You can only guess letters");
            } else
                return guess;

        }
    }
}