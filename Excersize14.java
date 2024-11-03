package Excersize14;

import java.util.Scanner;

public class Excersize14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double P, R, T, simpleInterest;
        System.out.println("enter the value of P");
        P = input.nextDouble();
        System.out.println("enter the value of R");
        R = input.nextDouble();
        System.out.println("enter the value of T");
        T = input.nextDouble();
        simpleInterest=(P*R*T)/100;
        System.out.println("the amount of simpleInterest is "+simpleInterest);

    }

}
