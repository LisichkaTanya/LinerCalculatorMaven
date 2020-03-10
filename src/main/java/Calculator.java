import java.util.Scanner;

/**
 * @author LisichkaTanya
 * This class realises the calculator
 */
public class Calculator {
    /**
     * This start point of the program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * This cycle allows you to continue calculations or exit the calculator
         * Elso we read a string from the console and run the method "calculate"
         */
        while (true){
            System.out.println("Enter the values to calculate. For example: \"-2+2\"");
            String string = scanner.nextLine();
            calculate(string);
            System.out.println("Do you want to exit calculator? Write: y/n");
            String exit = scanner.nextLine();
            if (exit.equals("y")) break;
            else continue;
        }
    }

    /**
     * This method allows calculations
     * @param s some string which was reading from the console and determine which calculation
     *         (addition, subtraction, multiplication, division, or exponentiation) should be performed
     */
    public static void calculate (String s)  {
        /**
         * A temporary variable <strong>actionSign</strong>, in which we put the calculation sign (+, -, /, *, ^)
         */
        String actionSign = " ";
        if (s.matches(".+\\+.+")) actionSign = "+";
        if (s.matches(".+-.+")) actionSign = "-";
        if (s.matches(".+\\*.+")) actionSign = "*";
        if (s.matches(".+\\/.+")) actionSign = "/";
        if (s.matches(".+\\^.+")) actionSign = "^";

        /**
         * Variables first, second and result of calculation
         */
        double first;
        double second;
        double result = 0;

        /**
         * Convert a string to an array of digits
         */
        String[] digits = s.split("-?(\\+|-|\\*|\\/|\\^)");

        /**
         * Check if we have negative number at first place
         * Put in our variables <strong>first</strong> and <strong>second</strong> digits from the array
         */
        if (s.matches("-.+")){
            first = Double.parseDouble(digits[1]);
            first = -first;
            second = Double.parseDouble(digits[2]);
        }
        else {
            first = Double.parseDouble(digits[0]);
            second = Double.parseDouble(digits[1]);
        }

        /**
         * Perform the calculation and display it on the screen
         */
        if (actionSign.equals("+")) result = first + second;
        if (actionSign.equals("-")) result = first - second;
        if (actionSign.equals("*")) result = first * second;
        if (actionSign.equals("/")) result = first / second;
        if (actionSign.equals("^")) result = Math.pow(first, second);
        System.out.println(" = " + result);
    }
}



