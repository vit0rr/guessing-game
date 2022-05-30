import java.util.*;

public class game {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random r = new Random();
            int randomNumber = r.nextInt(100) + 1;
            int counter = 0;

            do {
                counter += 1;
                System.out.println("Counter:" + counter);
                System.out.println("Try a number between 1 and 100");
                int userNumber = sc.nextInt();

                if (userNumber == randomNumber) {
                    System.out.println("Congrats, you won!");
                    break;
                } else if (userNumber > randomNumber) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
                if (counter > 9) {
                    System.out.println("You lose!");
                    break;
                }
            } while (true);
        }

    }

}