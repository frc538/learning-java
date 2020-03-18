/**
 * Notice the package, as described previously.
 */
package variables;

/**
 * As well as the class.
 */
public class App {
    /**
     * And the main method.
     */
    public static void main(String[] args) {
        /**
         * When we work with data, we may not be ready to print it out immediately. We
         * may need to do multiple steps of work on the data, or give it to other parts
         * of the program.
         * 
         * We can store data while we're working with it in things called variables.
         * Variables let us give a name to a place where data is stored in memory and
         * let us access it whenever we need it.
         * 
         * For example, we can store an integer in an integer variable, like so.
         */
        int integerVariable;

        /**
         * The int tells the program that the variable will store an integer.
         * 
         * When we create variables, called declaration or declaring variables, we have
         * to specify what kind of data the variable will hold. This is called the
         * variable's type.
         */

        /**
         * integerVariable is the name of the variable that we created. We can call a
         * variable (essentially) whatever we want!
         * 
         * There are a few rules: 1) You can use letters (lower or uppercase), numbers,
         * and underscores; 2) Variables can't start with a number.
         * 
         * Otherwise, there are some guidelines for naming variables. The most common is
         * that variables should have meaningful names. If the variable is meant to hold
         * an age, for example, age would be a good name!
         * 
         * The most common guideline you'll see is camelCase. Generally, variables start
         * with a lowercase letter. Then, every letter is lowercase. If the variable
         * name contains multiple words, each new word starts with a capital letter -
         * like integerVariable.
         */

        /**
         * After you've declared the variable, you can give it a value.
         * 
         * This process is called assignment and uses the = sign. You should assign
         * variables some value as soon as possible. It's okay if it has to change
         * later. In fact, the first time you give a variable a value, we call the
         * process initialization.
         * 
         * Keep in mind that you don't have to mention the variable's type after it's
         * been declared. You told Java it was an int the first time, now it always
         * knows.
         * 
         * When you see lines like this, you should NOT read it as "integerVariable
         * equals 8." A better way to read it is "integerVariable GETS 8" because you're
         * giving it the value 8 and you could give it a different value later. The
         * variable itself does not equal 8; it just HOLDS the value 8.
         */
        integerVariable = 8;

        /**
         * You can also initialize variables as soon as you create them, in one line.
         * 
         * Keep in mind that Java generally won't let you use a variable until you've
         * assigned it a value.
         */
        int thisIsAnotherVariable = 7;

        /**
         * Like before, we can print integer values, whether or not they're in a
         * variable.
         */
        System.out.println(8);
        System.out.println(integerVariable);
        System.out.println(thisIsAnotherVariable);

        /**
         * You can also use the variable name in place of the number itself.
         * 
         * This makes calculations easier.
         * 
         * For example, consider calculating the area of a rectangle. The last line uses
         * both variables, and it's the most obvious what it's doing. Anytime you can
         * put your code in plain language (write it like you read it), it makes it much
         * easier to understand and modify if needed.
         */
        int base = 10;
        int height = 20;
        System.out.println(10 * 20);
        System.out.println(10 * height);
        System.out.println(base * 20);
        System.out.println(base * height);

        /**
         * You can also use variables inside of methods, like those in the Math library.
         */
        int a = 3;
        int b = 4;
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));

        /**
         * You can also store the results of operations or methods in variables.
         */
        int product = 10 * 24;
        System.out.println(product);

        int absValue = Math.abs(-6);
        System.out.println(absValue);

        /**
         * You can also mix variables and strings in print statements.
         * 
         * The same operator precedence rules (PEMDAS/BODMAS) apply here as before, so
         * pay attention to how you write your prints.
         * 
         * Now that you know about variables, though, it's generally better to store
         * your calculation in a variable and just print the single variable, so that's
         * the recommended path going forward.
         */
        System.out.println("This will print the value in a: " + a);
        System.out.println("This will print the letter a: " + "a");
        System.out.println("You can do strings before the variable - " + a + " - and after!");

        /**
         * Once you've given a variable a value, you're free to change it!
         * 
         * As you may have noticed, code executes in the order that it is written, so if
         * you change the value of a variable before doing anything with it, the changed
         * value is what's used in the next operation.
         */
        int changingInt = 7;
        System.out.println(changingInt);

        changingInt = 18;
        System.out.println(changingInt);

        /**
         * It's important to note that you can assign the value of one variable to
         * another variable.
         */
        int firstVar = 1;
        int secondVar = 2;
        System.out.println("First Var: " + firstVar);
        System.out.println("Second Var: " + secondVar);

        firstVar = secondVar;
        System.out.println("First Var: " + firstVar);
        System.out.println("Second Var: " + secondVar);

        /**
         * The value of firstVar changed to secondVar's value.
         * 
         * This is where the "gets" phrasing helps. The firstVar GETS the value of the
         * secondVar.
         * 
         * This is important to remember because the value is moved over as a copy. This
         * means if you change the value of secondVar now, firstVar will still have the
         * value it had the last time we checked.
         */
        secondVar = 3;
        System.out.println("First Var: " + firstVar);
        System.out.println("Second Var: " + secondVar);

        /**
         * It is possible to change the value of a variable. It is also possible to use
         * a variable in a calculation.
         * 
         * You're also able to do both at once!
         */
        int changingVar = 10;
        System.out.println(changingVar);

        changingVar = changingVar + 5;
        System.out.println(changingVar);

        /**
         * You can do this will any calculation. The simplest operations are the
         * arithmetic operations we saw before.
         */
        changingVar = changingVar * 5;
        System.out.println(changingVar);

        changingVar = changingVar - 5;
        System.out.println(changingVar);

        changingVar = changingVar / 5;
        System.out.println(changingVar);

        changingVar = changingVar % 7;
        System.out.println(changingVar);

        /**
         * For these operations, Java has some common shorthand to do the same.
         */
        int longHandVar = 10;
        int shortHandVar = 10;

        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        longHandVar = longHandVar + 2;
        shortHandVar += 2;
        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        longHandVar = longHandVar * 2;
        shortHandVar *= 2;
        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        longHandVar = longHandVar - 2;
        shortHandVar -= 2;
        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        longHandVar = longHandVar / 2;
        shortHandVar /= 2;
        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        longHandVar = longHandVar % 7;
        shortHandVar %= 7;
        System.out.println(longHandVar);
        System.out.println(shortHandVar);

        /**
         * Java also has a shorthand for incrementing (adding 1) and decrementing
         * (subtracting 1).
         * 
         * Increment: x++ or ++x Decrement: x-- or --x
         * 
         * If you use the ++ or -- before the variable, it's called prefix. After is
         * called postfix.
         * 
         * In a lot of applications, you won't see a difference. These cases outline the
         * differences for incrementing, but decrementing behaves the same way.
         */
        int incrementingVar = 10;
        System.out.println("This is the value: " + incrementingVar);

        System.out.println("Postfix will use the value, THEN add 1 to it: " + incrementingVar++);
        System.out.println("Now the value has been updated: " + incrementingVar);

        System.out.println("Prefix will add 1 to the value, THEN use it: " + ++incrementingVar);
        System.out.println("The value stays updated: " + incrementingVar);

        // Floating-point variables

        // String variables

        // Changing values - shallow vs. deep

        // Null

        // Primitive types vs. objects

    }
}
