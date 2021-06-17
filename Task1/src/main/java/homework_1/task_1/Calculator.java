package homework_1.task_1;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }

    public void startCalculator() {
        Scanner scanner = new Scanner(System.in);
        //Input first number
        System.out.println("Input first number:");
        int a = Integer.parseInt(scanner.nextLine());
        //Input operator
        System.out.println("Input operator (+-/*):");
        String operator = scanner.nextLine();
        //Input second number
        System.out.println("Input second number:");
        int b = Integer.parseInt(scanner.nextLine());

        int result;

        if ("+".equals(operator)) {
            result = a + b;
        } else if ("-".equals(operator)) {
            result = a - b;
        } else if ("*".equals(operator)) {
            result = a * b;
        } else if ("/".equals(operator)) {
            if (b == 0) {
                System.out.println("Error: divide by zero");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Error: unknown operator");
            return;
        }

        System.out.println("Result = " + result);
    }

}
