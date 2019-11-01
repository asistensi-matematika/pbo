import java.util.Random;

public class coin{
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
           int coinflip = rand.nextInt(3)+1;
           System.out.println(coinflip);
        }
    }
}