package Excersize15;

import java.util.Scanner;

public class Excersize15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, root1, root2;
        System.out.println("please enter the value of a");
        a = input.nextDouble();
        System.out.println("please enter the value of b");
        b = input.nextDouble();
        System.out.println("please enter the value of c");
        c = input.nextDouble();

        root1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
        root2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
        System.out.println("the root1 is " + root1);
        System.out.println("the root2 is " + root2);
        
    }

}
