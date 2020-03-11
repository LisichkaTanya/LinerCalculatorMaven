public class Calculate {
    /**
     * This method allows calculations
     * @param s some string like "-2+2", which was reading from the console and determine which calculation
     *         (addition, subtraction, multiplication, division, or exponentiation) should be performed
     * @return Return result of calculation
     */
    public double calculating (String s)  {
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
        return result;
    }
}
