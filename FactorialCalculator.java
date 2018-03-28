import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial: ");
        int number = input.nextInt();
        long factorial = factorialNumber(number);
        System.out.println("The factorial of number " + number + " is: " + factorial);
    }
    public static long factorialNumber(int number){
        if (number <= 1){
            return 1;
        }
        return number * factorialNumber(number - 1);
    }
}
