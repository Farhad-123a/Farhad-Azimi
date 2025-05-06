package phonenumber;

import java.util.Scanner;

public class Phonenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        String num = input.next();
        if (num.matches("079.*") && num.matches("[0-9(7)]+") || num.matches("072.*")) {
            System.out.println("your number " + num + " is Roshan");

        } else if (num.matches("070.*") && num.matches("[0-9(7)]+") || num.matches("071.*")) {
            System.out.println("your number " + num + " is AWCC");

        } else if (num.matches("076.*") && num.matches("[0-9(7)]+") || num.matches("077.*")) {
            System.out.println("your number " + num + " is MTN");

        } else if (num.matches("078.*") && num.matches("[0-9(7)]+") || num.matches("073.*")) {
            System.out.println("your number " + num + " is Etisalat");

        } else if (num.matches("074.*") && num.matches("[0-9(7)]+")) {
            System.out.println("your number " + num + " is Salam");

        } else {
            System.out.println("Your Number is Wrong");
        }
    }
}

}
