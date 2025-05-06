package palindrum;

import java.util.Scanner;

public class Palindrum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Text = input.next();
        String re = new StringBuilder(Text).reverse().toString();
        if (Text.equals(re)) {
            System.out.println("The " + Text + " is palindrum ");
        } else {
            System.out.println("The " + Text + " is not palindrum");
        }

    }

}
