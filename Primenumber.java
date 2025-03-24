 
 
package primenumber;
      import java.util.Scanner;
    public class Primenumber {
  
       
  
    public static boolean Primenum(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <=Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        int number =input.nextInt();
        if (Primenum(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

           

}
  

}
    

    
  

