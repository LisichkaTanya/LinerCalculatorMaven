import java.util.Scanner;

/**
 * @author LisichkaTanya
 * This class realises the calculator
 */
public class Calculator {
    /**
     * This start point of the program
     * @param args This start point of the program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();

        /**
         * This cycle allows you to continue calculations or exit the calculator
         * Also we read a string from the console and run the method "calculate"
         */
        while (true){
            System.out.println("Enter the values to calculate. For example: \"-2+2\"");
            String string = scanner.nextLine();
            System.out.println(calculate.calculating(string));
            System.out.println("Do you want to exit calculator? Write: y/n");
            String exit = scanner.nextLine();
            if (exit.equals("y")) break;
            else continue;
        }
    }
}



