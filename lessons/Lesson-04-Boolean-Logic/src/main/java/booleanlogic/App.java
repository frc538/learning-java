package booleanlogic;

public class App {
    public static void main(String[] args) {
        /**
         * Variables will prove to be a useful tool in learning the next big idea in
         * programming.
         * 
         * So far, all of the programs you've seen have run in the order that they're
         * written without exception.
         * 
         * We won't be seeing that difference here, but this lesson will set us up
         * nicely for that concept.
         */

        /**
         * One thing we saw with variables is that their value can change. Sometimes we
         * want variables to hold a value that will never change. Java gives us
         * constants for this.
         * 
         * In order to turn a variable into a constant, you just have to start the
         * declaration with the word "final." Of course, you'll have to initialize the
         * constant when you declare it.
         */
        final int DAYS_IN_ONE_WEEK = 7;
        System.out.println(DAYS_IN_ONE_WEEK);

        final double PI = 3.14;
        System.out.println(PI);

        final String MONDAY = "Monday";
        System.out.println(MONDAY);

        /**
         * You can see that you can use constants (mostly) just like variables.
         * 
         * We usually write constants in all capital letters with underscores between
         * words.
         * 
         * The big difference is that your program will not run if you try to change the
         * value of a constant.
         */

        /**
         * There is one primitive type you haven't seen yet - the boolean.
         * 
         * A boolean represents one of two values - true or false. You might think about
         * these values as 1 and 0 or on and off. While this is a good way to think
         * about it (and in some languages, it is the same!), Java sticks strictly to
         * true and false.
         */
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        System.out.println(trueBoolean);
        System.out.println(falseBoolean);

        /**
         * Booleans can have no other values, so they're a pretty simple type of data to
         * work with. Anything that you can phrase as a question with a yes or no answer
         * can give you a boolean!
         * 
         * Is it raining today?
         * 
         * Is 4 bigger than 5?
         * 
         * Is 5 smaller than 5?
         * 
         * All of these will give true values if the answer is yes or false if the
         * answer is no.
         */

        /**
         * We can start by comparing integers.
         * 
         * We have the symbols > (greater than), < (less than), >= (greater than or
         * equal to), and <= (less than or equal to).
         * 
         * For example, 3 > 4 is false and 4 > 3 is true.
         */
        boolean comparisonResult = 3 > 4;
        System.out.println(comparisonResult);

        comparisonResult = 3 < 4;
        System.out.println(comparisonResult);

        comparisonResult = 3 >= 4;
        System.out.println(comparisonResult);

        comparisonResult = 3 <= 4;
        System.out.println(comparisonResult);

        comparisonResult = 3 > 3;
        System.out.println(comparisonResult);

        comparisonResult = 3 < 3;
        System.out.println(comparisonResult);

        comparisonResult = 3 >= 3;
        System.out.println(comparisonResult);

        comparisonResult = 3 <= 3;
        System.out.println(comparisonResult);

        /**
         * This, of course, also works if you use variables.
         */
        int firstNumber = 3;
        int secondNumber = 4;
        comparisonResult = firstNumber > secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber < secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber >= secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber <= secondNumber;
        System.out.println(comparisonResult);

        secondNumber = 3;
        comparisonResult = firstNumber > secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber < secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber >= secondNumber;
        System.out.println(comparisonResult);

        comparisonResult = firstNumber <= secondNumber;
        System.out.println(comparisonResult);

        /**
         * And a comparison will produce ta rue/false result even if you don't store it
         * in a variables.
         */
        System.out.println(3 > 3);
        System.out.println(firstNumber <= secondNumber);

        /**
         * You can also compare doubles in this way.
         */
        System.out.println(1.0 > 2.0);

        /**
         * It is sometimes possible to compare values for different types (ints and
         * doubles), but you should generally avoid this unless you absolutely have to.
         */

        /**
         * We also have two other comparisons. To see if two variables are equal, we use
         * ==. To see if they are not equal, we use !=.
         * 
         * Notice that the equality check is == with two equal signs while the
         * assignment operator is = with just one. This is why we suggest saying GETS
         * for assignment, because we use == to see if two things are actually equal.
         * 
         * x = 5 is read "x gets the value 5"
         * 
         * x == 5 is read "is x equal to 5?"
         * 
         */
        firstNumber = 3;
        secondNumber = 4;

        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);

        System.out.println(3 == 4);
        System.out.println(3 != 4);

        /**
         * The same comparisons CAN technically be used for floating point types (like
         * doubles), but you should avoid them for those types.
         * 
         * Computers can't store floating point numbers exactly due to memory
         * limitations, so it's very possible that two numbers you think are equal are
         * not (to the computer, at least).
         * 
         * For doubles, it is suggested that you take the absolute value of the
         * difference and compare that to some small threshold.
         * 
         * For example, 0.1 and 0.1001 are the same if your threshold is smaller than
         * 0.0001.
         * 
         * The bigger the threshold, the more different the numbers can be for you to
         * consider them "equal."
         */
        double firstDouble = 1.001;
        double secondDouble = 1;

        System.out.println(Math.abs(firstDouble - secondDouble) < 0.1);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.01);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.001);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.0001);

        /**
         * We use the absolute value in case we're comparing 1.001 to 1 or 0.999 to 1
         * (and we only want to do one check).
         */
        secondDouble = 0.999;
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.1);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.01);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.001);
        System.out.println(Math.abs(firstDouble - secondDouble) < 0.0001);

        // Double comparison

        // String comparison

        // And - &&

        // Or - ||

        // Not

        // Regular And - &

        // Regular Or - |

    }
}
