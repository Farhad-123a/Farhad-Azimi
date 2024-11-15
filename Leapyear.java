
package leapyear;

import java.util.Scanner;

public class leapyear {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        int year = input.nextInt();
        boolean leapyear = (year%4==0 && year%100!=0)|| (year % 400==0);
        
        if(leapyear){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"is not leap year");
            
                   
        }
    }
    
}
