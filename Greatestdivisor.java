package greatestdivisor;

import java.util.Scanner;

public class Greatestdivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
 int i;
 if(num1>num2){
     i=num1;
             }
 else{
     i=num2;  
    }
  while((num1%i!=0)||(num2%i!=0)){
        i--;
    }
        System.out.println("GCD "+num1+" and "+num2+" is "+i);    
        }

}
