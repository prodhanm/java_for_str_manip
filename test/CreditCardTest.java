package test;

import src.CreditCardStr;

public class CreditCardTest {

    public static void main(String[] args) {
        testCcSingleString();
    }

    @SuppressWarnings("static-access")
    public static void testCcSingleString() {
        CreditCardStr cc = new CreditCardStr();

        // Test case 1
        String input = "9876-5432-1098-7654";
        if(input.indexOf("-") != -1) {
            String expectedOutput = "9876543210987654";
            String actualOutput = cc.ccSingleString(input);
            assert expectedOutput.equals(actualOutput) : "Test case 2 passed";
            System.out.println("Test case 1 passed");
        }

        // Test case 2
        String input2 = "9876 5432 1098 7654";
        if(input2.indexOf("-") == -1) {
            String expectedOutput2 = "9876543210987654";
            String actualOutput2 = cc.ccSingleString(input2);
            assert expectedOutput2.equals(actualOutput2) : "Test case 2 failed";
            System.out.println("Test case 2 failed");
        }

        System.out.println("All test cases passed!");
    }
}