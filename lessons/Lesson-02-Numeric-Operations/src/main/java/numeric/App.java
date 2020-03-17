/**
 * Same as before, this file's package
 * is numeric because the directory inside
 * src/main/java is called numeric.
 */
package numeric;

/**
 * And the class name is the same as the file.
 */
public class App {
    /**
     * We also have the main method that will allow the program to run.
     */
    public static void main(String[] args) throws Exception {
        /**
         * As we saw before, you can print string literals.
         */
        System.out.println("Hello world!");

        /**
         * You can also print whole numbers - called integers.
         */
        System.out.println(2);

        /**
         * You can also print numbers as text.
         */
        System.out.println("2");

        /**
         * The first case is the actual number 2 while the second case is a piece of
         * text that shows the character 2.
         */

        /**
         * You can also concatenate text and numbers.
         */
        System.out.println("Age in years: " + 15);

        /**
         * If you're dealing with just numbers, you can perform addition with the plus
         * sign (+).
         */
        System.out.println(11 + 19);

        /**
         * You can also add text after the math part, and you'll get concatenation
         * again.
         */
        System.out.println(11 + 19 + " now this is a string");

        /**
         * If the string comes first, though, Java will assume you want everything
         * concatenated, so the addition won't occur like you might expect.
         */
        System.out.println("No addition actually occurred: " + 11 + 19);

        /**
         * You can get around this problem by putting your math inside more parentheses,
         * then Java will work from the inside out, and your math will occur.
         */
        System.out.println("Addition actually occurred: " + (11 + 19));

        /**
         * Subtraction also works in Java.
         */
        System.out.println(19 - 11);
        System.out.println(19 - 11 + " now this is a string");
        System.out.println("Subtraction actually occurred: " + (19 - 11));

        /**
         * You'll notice that this case isn't included: System.out.println("No
         * subtraction actually occurred: " + 19 - 11);
         * 
         * Java treats + and - with the same precendence, just like in PEMDAS/BODMAS.
         * 
         * It then starts left to right. Since the first thing it finds is a string and
         * it is following left-to-right PEMDAS/BODMAS, Java assumes everything inside
         * will be treated as a string.
         * 
         * Strings can use + but not -, so this line won't work with subtraction.
         */

        /**
         * When doing math in Java, you can always make use of more parentheses to
         * either enforce the order in which calculations occur or to make the text a
         * little more clear.
         */

        /**
         * Multiplication also works in Java.
         */
        System.out.println(19 * 11);
        System.out.println(19 * 11 + " now this is a string");
        System.out.println("Multiplication actually occurred: " + (19 * 11));

        /**
         * This line works this time for multiplication. In PEMDAS/BODMAS,
         * multiplication happens before addition/subtraction, so Java starts there.
         * 
         * Since 19 and 11 are both integers, Java has no problem multiplying them
         * before concatenating with the string.
         */
        System.out.println("Multiplication actually occurred: " + 19 * 11);

        /**
         * Java also supports division.
         */
        System.out.println(12 / 1);
        System.out.println(12 / 2);
        System.out.println(12 / 3);
        System.out.println(12 / 4);
        System.out.println(12 / 6);
        System.out.println(12 / 12);

        /**
         * These all print like they did for multiplication because PEMDAS/BODMAS treats
         * division the same as multiplication (since they're acutally the same
         * operation).
         */
        System.out.println(24 / 3);
        System.out.println(24 / 3 + " now this is a string");
        System.out.println("Division actually occurred: " + (24 / 3));
        System.out.println("Division actually occurred: " + 24 / 3);

        /**
         * Note that dividing by 0 will crash your program. Just like in real math.
         */

        /**
         * We used nice numbers in the previous examples so they all worked out evenly.
         * When that isn't the case, we see behavior you might not expect.
         */
        System.out.println(25 / 2);

        /**
         * You might have expected 12.5, but the correct answer is 12.
         * 
         * Since 25 and 2 are both integers, Java assumes the answer to their division
         * must also be an integer. This is called integer division.
         * 
         * In elementary school, doing this problem by hand would have given you the
         * answer 12 with remainder 1.
         * 
         * The 12 is the quotient and the 1 is the remainder.
         * 
         * In integer division, the quotient is the answer and we ignore the remainder.
         */

        /**
         * In this example, we'll get 4 instead of 4.875.
         */
        System.out.println(39 / 8);

        /**
         * Since integer division gives us the quotient, Java also gives us a way to get
         * the remainder.
         * 
         * This operation is called the modulus operation.
         * 
         * It is also called modulus division.
         * 
         * It performs a similar division but ignores the quotient and only gives us the
         * remainder.
         */
        System.out.println(24 % 7);
        System.out.println(24 % 7 + " now this is a string");
        System.out.println("Division actually occurred: " + (24 % 7));
        System.out.println("Division actually occurred: " + 24 % 7);

        /**
         * Notice that all lines worked as expected.
         * 
         * From the perspective of PEMDAS/BODMAS, multiplication, division, and modulus
         * division are all treated equally.
         */

        /**
         * Modulus can be a simple check for even and odd numbers.
         * 
         * If the remainder is 1 when mod 2, the number is odd. If the remainder is 0
         * when mod 2, the number is even.
         */
        System.out.println("Even: " + 18 % 2);
        System.out.println("Odd: " + 19 % 2);

        /**
         * In addition to integers, we have real numbers.
         * 
         * You'll also hear these called floating-point or decimal numbers, informally.
         * 
         * The main difference in appearance is that floating point numbers have decimal
         * points - always.
         */
        System.out.println("This is an integer: " + 2);
        System.out.println("This is a floating point number: " + 2.0);

        /**
         * These operations also work with floating point numbers.
         */
        System.out.println(12.0 + 5.0);
        System.out.println(12.0 - 5.0);
        System.out.println(12.0 * 5.0);
        System.out.println(12.0 % 5.0);

        /**
         * Division with floating point numbers works exactly as you'd expect since the
         * numbers don't have to be integers anymore.
         */
        System.out.println(12.0 / 5.0);

        /**
         * You can also mix and match floating point numbers with integers. The integers
         * will get interpreted as floating points.
         * 
         * And it doesn't matter which is first.
         */
        System.out.println(12.0 + 5);
        System.out.println(12.0 - 5);
        System.out.println(12.0 * 5);
        System.out.println(12.0 % 5);
        System.out.println(12.0 / 5);

        System.out.println(12 + 5.0);
        System.out.println(12 - 5.0);
        System.out.println(12 * 5.0);
        System.out.println(12 % 5.0);
        System.out.println(12 / 5.0);

        /**
         * Finally, be aware that floating point numbers can be tricky.
         * 
         * The computer is able to exactly store an integer, even large ones like a
         * million.
         * 
         * Decimal numbers are harder, so what you think should be 0.2 might actually be
         * something like 1.9999999999998 or 2.0000000000000003.
         * 
         * We'll see more about this later. For now, if the decimal number isn't exactly
         * what you expect, check and see if it's really close - it might not be wrong!
         */

        /**
         * Java also has a library of math methods.
         */

        /**
         * This library includes constants.
         */
        System.out.println(Math.E);
        System.out.println(Math.PI);

        /**
         * A square root method.
         * 
         * You give it a number (integer or floating) and it gives you a floating point
         * number.
         * 
         * Be aware that almost all math methods will give you back a floating point
         * number, even if you gave it an integer.
         */
        System.out.println(Math.sqrt(2));

        /**
         * An absolute value method.
         */
        System.out.println(Math.abs(11));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-11));

        /**
         * A power method.
         * 
         * Give it two numbers and it raises one to the power of the other.
         * 
         * For example, giving 7 and 3 gives you 7 to the 3rd power, and it works for
         * negative or decimal powers, so you can get inverses or roots!
         */
        System.out.println(Math.pow(7, 3));
        System.out.println(Math.pow(2, -2));
        System.out.println(Math.pow(2, 0.25));

        /**
         * There are also methods for sine, cosine, and tangent. They take their values
         * in as radians, so be careful.
         */
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.cos(Math.PI / 6));
        System.out.println(Math.tan(Math.PI / 6));

        /**
         * Java also has the arc methods for sine, cosine, and tangent. Their outputs
         * will be in radians.
         * 
         * Values will be in the range -PI/2 to PI/2 for sine and tangent and 0 to PI
         * for cosine.
         * 
         * Don't forget to pay attention to your domains!
         */
        System.out.println(Math.asin(-0.5));
        System.out.println(Math.acos(0.5));
        System.out.println(Math.atan(-1));

        /**
         * The ceil method will give you the smallest integer greater than or equal to
         * the current value.
         * 
         * So 1.9 gives 2 and so does 1.1, but 1.0 gives 1.0.
         * 
         * With negatives, -1.9 gives -1 and so does -1.1 and -1.0.
         */
        System.out.println(Math.ceil(1.9));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.ceil(1.0));
        System.out.println(Math.ceil(-1.9));
        System.out.println(Math.ceil(-1.1));
        System.out.println(Math.ceil(-1.0));

        /**
         * The floor method will give you the largest integer less than or equal to the
         * current value.
         * 
         * So 1.9 gives 1 and so does 1.1, as does 1.0.
         * 
         * With negatives, -1.9 gives -2 and so does -1.2, but -1.0 gives -1.0
         */
        System.out.println(Math.floor(1.9));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.floor(1.0));
        System.out.println(Math.floor(-1.9));
        System.out.println(Math.floor(-1.1));
        System.out.println(Math.floor(-1.0));

        /**
         * We can also round numbers with round.
         * 
         * Round acts like regular rounding, up or down, with 0.5 rounding up.
         */
        System.out.println(Math.round(1.9));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.0));
        System.out.println(Math.round(-1.9));
        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(-1.1));
        System.out.println(Math.round(-1.0));

        /**
         * Exp will take the value e and raise it to whatever power you give it.
         */
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(2.5));
        System.out.println(Math.exp(-1));
        System.out.println(Math.exp(0));

        /**
         * Log will take the natural log (base e) of whatever you give it.
         * 
         * Just remember to use only positive numbers - no negatives or 0.
         */
        System.out.println(Math.log(1));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log(15));

        /**
         * Log10 will take the common log (base 10) of whatever you give it.
         * 
         * Just remember to use only positive numbers - no negatives or 0.
         */
        System.out.println(Math.log10(1));
        System.out.println(Math.log10(10));
        System.out.println(Math.log10(15));

        /**
         * Max will give you the larger of two numbers and min will give you the
         * opposite.
         */
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));

        /**
         * Hypot gives you a quick way to calculate a hypotenuse. Just give it the
         * lengths of the other two sides.
         */
        System.out.println(Math.hypot(1, 1));
        System.out.println(Math.hypot(1, Math.sqrt(3)));
        System.out.println(Math.hypot(3, 4));

        /**
         * atan2 is a special version of arctangent.
         * 
         * If you give it a y-value and x-value (in that order), it will convert the
         * coordinate to a polar coordinate (r-theta) and give you back the angle theta,
         * instead of limiting the calculation to -PI/2 to PI/2.
         */
        System.out.println(Math.atan2(1, 1));
        System.out.println(Math.atan2(-1, 1));
        System.out.println(Math.atan2(1, -1));
        System.out.println(Math.atan2(-1, -1));
    }
}
