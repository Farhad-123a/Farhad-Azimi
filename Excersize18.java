
package Excersize18;
import java.util.Scanner;

public class Excersize18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int number = input.nextInt();
        int o = 0;
        int reversednumber = o;
        while (number !=0){int digit = number % 10;
        reversednumber=reversednumber*10+digit;
        number/= 10;
        System.out.println("reversed number is"+ reversednumber);
        }
        
        
    }
    
}
