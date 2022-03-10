public class Draw {

    public void draw_word(String bad_guesses, String good_guesses, String secret_word){
        System.out.println("Strikes: "+bad_guesses.length()+"/7");

        System.out.print("Missed Letter: ");
        for (int i=0; i<bad_guesses.length(); i++){
            System.out.print(bad_guesses.charAt(i)+" ");
        }
        System.out.print("\n\nThe Secret Word:  ");

        for (int i=0;i<secret_word.length();i++){
            if (good_guesses.indexOf(secret_word.charAt(i)) != -1 ){
                System.out.print(secret_word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println("\n\n\n\n");
    }
}
