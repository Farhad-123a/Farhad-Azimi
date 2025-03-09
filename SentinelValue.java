package sentinel.value;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int ran1 = (int) (Math.random() * 100);

            System.out.println(ran1 + " \n 1- enter zero for next number \n 2- other numbers will stop the program");
            int enter = input.nextInt();
            if (enter == 0) {
                 count++;
               
                System.out.println(sum += ran1);
                continue;
                

                

            } else {

                break;

            }
           

        }

    }

}
