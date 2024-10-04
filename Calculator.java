import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    //method to perform addition
    public static double add(double x, double y){
        return x + y;
    }
    //method to perform subtraction
    public static double subtract(double x, double y){
        return x - y;
    }
    //method to perform multiplication
    public static double multiply(double x, double y){
        return x * y;
    }
    //method to perform divison
    public static double divison(double x, double y){
        return x / y;
    }

    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);
        
        try{
            System.out.println("Simple Calculator");
            System.out.println("-----------------");

            System.out.println("Enter first number: ");
            double num1 = calculate.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = calculate.nextDouble();
            
            System.out.println("Choose an operation: + - * /");
            char operation = calculate.next().charAt(0);

            double result = 0;
            switch (operation){
                case '+':
                result = add(num1, num2);
                break;
                case '-':
                result = subtract(num1, num2);
                break;
                case '*':
                result = multiply(num1, num2);
                break;
                case '/':
                try {
                    if (num2 == 0){
                        throw new ArithmeticException("Divison by zero");
                    }
                    result = divison(num1, num2);
                } catch (ArithmeticException e){
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
                default:
                System.out.println("Invalid input. Please try again");
                return;
            }
            System.out.println("Result " + result);
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input" + e.getMessage());
        } finally {
            calculate.close();
        }
    }


}
