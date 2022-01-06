package Functions.Homework2;
import java.util.Scanner;
public class FunctionsHomework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check prime:");
        int n= input.nextInt();
        if(isPrime(n, 2)){
            System.out.println(n+" is prime.");
        }else
        System.out.println(n+" is not prime.");
    }
    static boolean isPrime(int number,int i){
        if(i>=number){
            return true;
        }
       if(number%i==0){
           return false;
       }
       else return isPrime(number,i+1);

    }

 
}