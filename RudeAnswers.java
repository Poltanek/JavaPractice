import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class RudeAnswers {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;

        out.print("Type your question: ");
        keyboard = nextLine();
        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber) {
            case 1 -> out.println("Yes, Isn't it obvious?");
        }
    }
}
