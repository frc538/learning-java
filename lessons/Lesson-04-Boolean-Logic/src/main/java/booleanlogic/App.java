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

        /**
         * For Strings, we're limited to the == and != operators. Some languages define
         * the other operators (like >) for strings, but Java does not.
         */

        String firstString = "a";
        String secondString = "b";
        System.out.println(firstString == secondString);
        System.out.println(firstString != secondString);

        firstString = "a";
        secondString = "a";
        System.out.println(firstString == secondString);
        System.out.println(firstString != secondString);

        /**
         * While these may give you the expected results SOMETIMES, you shoud generally
         * avoid using == and != for strings. This has to do with how objects and
         * primitive types check for equality.
         * 
         * Primitive types are equal if the variables have the same value. Objects (like
         * strings) are equal if the variables refer to the same (physical) thing.
         * 
         * This is a subtle difference and more complicated that we need to consider
         * right now. For the time being, do not use == and != with strings.
         */

        /**
         * If you need to see if two strings are equal, you should use the equals()
         * method. The equals() method will compare the two strings and give back a
         * boolean representing if they are the same text (all characters exactly the
         * same).
         */
        firstString = "B";
        secondString = "B";
        System.out.println(firstString.equals(secondString));

        firstString = "A";
        secondString = "B";
        System.out.println(firstString.equals(secondString));

        /**
         * When you compare strings this way (as you should), make sure neither string
         * is null. Otherwise, you risk your program crashing!
         */

        /**
         * The one exception for strings (and any object) is null. You should always use
         * == and != when comparing a string to null. This will be the case for any
         * object, not just strings.
         */
        String notNullString = "my string";
        System.out.println(notNullString == null);
        System.out.println(notNullString != null);

        String nullString = null;
        System.out.println(nullString == null);
        System.out.println(nullString != null);

        /**
         * Just like we have operators for our numerical values, we have special
         * operations we can perform on booleans.
         * 
         * We can take one boolean value and invert it - change true to false and false
         * to true.
         * 
         * This operation is called "NOT," and we use the ! symbol (read: bang).
         */
        boolean areNumbersEqual = 4 == 5;
        System.out.println(areNumbersEqual);
        System.out.println(!areNumbersEqual);

        firstNumber = 4;
        secondNumber = 4;
        areNumbersEqual = firstNumber == secondNumber;
        System.out.println(areNumbersEqual);
        System.out.println(!areNumbersEqual);

        /**
         * The "NOT" operation isn't necessarily something we need for numbers - we have
         * both the == and != operations. But it is extremely useful for strings. Since
         * strings only have the .equals() method (remember not to use == or != with
         * strings), the not operator comes in handy.
         */
        boolean areStringsEqual = firstString.equals(secondString);
        System.out.println(areStringsEqual);
        System.out.println(!areStringsEqual);

        /**
         * You can combine two or more boolean comparisons into a single check. There
         * are a couple of different ways to approach this.
         */

        /**
         * Suppose you have two checks that both must be true. You need an integer to be
         * over 5 but below 15.
         * 
         * We call this conjunction. If both conditions are true, then the whole
         * expression is true. If either (or both) is false, the whole expression is
         * false.
         * 
         * This operation is also called ANDing - because it only produces a true value
         * if the first value AND all other values are true.
         * 
         * To write this, use the && symbol.
         */
        int andIntegerValue = 6;
        boolean andValue = (andIntegerValue > 5) && (andIntegerValue < 15);
        System.out.println(andValue);

        /**
         * Suppose you have two checks and it's enough for either to true. You need an
         * integer to be under 5 or over 15.
         * 
         * We call this disjunction. If either (or both) conditions are true, then the
         * whole expression is true. If both are false, the whole expression is false.
         * 
         * This operation is also called ORing - because it produces a true value if the
         * first value OR any other value is true.
         * 
         * To write this, use the || symbol.
         */
        int orIntegerValue = 20;
        boolean orValue = (orIntegerValue < 5) || (orIntegerValue > 15);
        System.out.println(orValue);
    }
}
