import java.util.Random;

public class Words {

    String[] fruits = {"apple", "banana", "orange", "coconut", "strawberry", "lime", "grapefruit", "lemon", "kumquat", "blueberry", "melon"};

    Random random = new Random();

    public String get_fruit (){
        return fruits[random.nextInt(fruits.length)];
    }
}
