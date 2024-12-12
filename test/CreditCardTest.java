package test;

import src.CreditCardStr;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardStr.main(new String[] {});

        testCcSingleString();
        testCcSingleString2();
        testCcSingleString3();
        System.out.println("All tests passed!");
    }

    @SuppressWarnings("static-access")
    public static void testCcSingleString() {
        CreditCardStr cc = new CreditCardStr();

        // Test case 1 should only pass
        String input = "9876-5432-1098-7654";
        String expected = "9876543210987654";
        String result = cc.ccSingleString(input);

        if(!expected.equals(result)) {
            System.out.println("Test case 1 failed ");
        }
        else {
            System.out.println("Test case 1 passed " + result);
        }
    }

    @SuppressWarnings("static-access")
    public static void testCcSingleString2() {
        CreditCardStr cc = new CreditCardStr();
        // Test case 2
        String input2 = "9876 5432 1098 7654";
        String expected2 = "9876543210987654";
        String result2 = cc.ccSingleString(input2);

        if(!expected2.equals(result2)) {
            System.out.println("Test case 2 failed " + result2);
        }
        else {
            System.out.println("Test case 2 passed");
        }
    }

    @SuppressWarnings("static-access")
    public static void testCcSingleString3() {
        CreditCardStr cc = new CreditCardStr();
        // Test case 3
        String input3 = "9876543210987654";
        String expected3 = "9876543210987654";
        String result3 = cc.ccSingleString(input3);

        if(expected3.equals(result3)) {
            System.out.println("Test case 3 failed " + input3);
        }
        else {
            System.out.println("Test case 3 passed");
        }
    }

}