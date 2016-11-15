import java.util.Scanner;

public class RSA {
    
    
    public static void main(String[] args){
        
        
        
        //Get the user's input
        Scanner k = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Please enter the message m (in integers): ");
        int message = k.nextInt();
        
        System.out.print("Please enter the key(e, n) in the form of e space n: ");
        int e = k.nextInt();
        int n = k.nextInt();
        
        System.out.println();
        
        //display the user's input
        System.out.println("Message entered is: " + message);
        System.out.println("Key(e, n): (" + e + ", " + n + ")");
        System.out.println();

        
        //use these to hold the values while doing the calculation
        int result = 1;
        int temp = 0;
        
        //use this loop to do the calculations of the mod and display the results as it computes it
        for (int i = 1; i <= e; i++){
            temp = message % n;
            result = (result * temp) % n;
            System.out.println(message + "^" + i + " mod " + n + " = " + result%n + "\t    " + "(" + Math.pow(message, i) + ") " );
            
        }
        
        
        //display the final result to the user
        result = result % n;
        System.out.println();
        System.out.println("Ciphertext is : " + result);
        System.out.println();
        
    }
    
    

}