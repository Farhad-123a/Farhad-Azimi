package Excersize19;

import java.util.Scanner;

public class Excersize19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = input.nextInt();
        System.out.println("enter the second number:");
        int num2 = input.nextInt();
        System.out.println("enter the third number:");
        int num3 = input.nextInt();
        
        int max= (num1>num2)?((num1>num3)? num1 : num3): ((num2>num3)? num2 : num3);
        System.out.println("the max number is"+max);

    }

}
