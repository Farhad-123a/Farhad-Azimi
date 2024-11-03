
package Excersize17;
/

import java.util.Scanner;

public class Excersize17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter an integer:");
        number = input.nextInt();
        
        boolean isPrime= checkPrime(number);
        if (isPrime){System.out.println(number+"is a prime number");}
        else{ System.out.println(number+"is not a prime number");}
        input.close();
        
        
        
        
    }

    private static boolean checkPrime(int number) {
        {      int num = 0;
if (num<=1){ return false;}

for (int i = 2 ; i <=Math.sqrt(num); i++);
{                              int i = 0;
if (num% i == 0){ return false;}

}
    }       
    return true;    
        
      
    } 
    
}
