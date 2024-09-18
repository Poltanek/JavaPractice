import java.text.NumberFormat;
import java.util.Random;

public class BetterAccount {
    String FirstName;
    int id;
    double balance;

    void fillWithData() {
        var myRandom = new Random();

        FirstName = "" +
                (char) (myRandom.nextInt(26) + 'A') +
                (char) (myRandom.nextInt(26) + 'a') +
                (char) (myRandom.nextInt(26) + 'a');
        
        id = myRandom.nextInt(10000);
        balance = myRandom.nextInt(10000);
    }

    void display() {
        var currency = NumberFormat.getCurrencyInstance();

        out.print("The account with last name ");
        out.print(FirstName);

    }
}
