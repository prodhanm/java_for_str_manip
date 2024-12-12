package src;
import java.util.Scanner;

public class CreditCardStr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String ccNumber = inp.nextLine();
        System.out.println("Credit card number: " + ccSingleString(ccNumber));
        inp.close();
    }

    public static String ccSingleString(String ccNum) {
        return ccNum.replace("-", "");
    }
    
}
