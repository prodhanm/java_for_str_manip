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

    public static String ccSingleString(String ccStr) {
        String[] ccArray = {"-", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "=", "{", "}", "[", "]", "|", "\\", ":", ";", "\"", "'", "<", ">", ",", ".", "?", "/", " ", "", null};
        for (int i = 0; i < ccArray.length; i++) {
            if(ccArray[i] != null) {
                ccStr = ccStr.replace(ccArray[i], "");
            }
        }
        return ccStr;
        
    }
    
}
