public class Main {

    public static void main(String[] args) {
        Draw draw = new Draw();
        Guess get_guess = new Guess();
        Words words = new Words();
        String secret_word = words.get_fruit();
        String bad_guesses = "";
        String good_guesses = "";
        Boolean found;

        System.out.println("\n**************************");
        System.out.println(" Welcome to Hangman Game!");
        System.out.println("**************************\n\n");


        while (true){

            String guess = get_guess.get_guess(bad_guesses, good_guesses);

            if (secret_word.contains(guess)) {
                good_guesses = good_guesses + guess;

                found = true;

                for (int i = 0; i < secret_word.length(); i++) {
                    if (good_guesses.indexOf(secret_word.charAt(i)) == -1) {
                        found = false;
                    }
                }


                if (found) {
                    System.out.println("You win!");
                    System.out.println("The secret word was: " + secret_word);
                    break;
                }
            }
            else {
                bad_guesses = bad_guesses + guess;
                if (bad_guesses.length() == 7){
                    draw.draw_word(bad_guesses, good_guesses, secret_word);
                    System.out.println("You lost!");
                    System.out.println("The secret word was: " + secret_word);
                    break;
                }
            }

            draw.draw_word(bad_guesses, good_guesses, secret_word);
        }
    }
}
