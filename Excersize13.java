
package Excersize13;

import java.util.Scanner;

public class Excersize13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;
        System.out.println("Enter the value of F");
        F= input.nextDouble();
        C=(F-32d)*5/9;
        System.out.println("the C is"+C);
        
    }
    
}
