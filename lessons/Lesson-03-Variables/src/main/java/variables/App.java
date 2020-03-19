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

        /**
         * In addition to integer variables, you can store floating point numbers in
         * variables.
         * 
         * These are usually of type double.
         */
        double decimalNumber = 1.5;

        /**
         * You can perform many of the same operations you saw with integers.
         */
        System.out.println(decimalNumber);
        decimalNumber += 10.1;
        System.out.println(decimalNumber);

        System.out.println(decimalNumber++);
        System.out.println(decimalNumber);
        System.out.println(++decimalNumber);
        System.out.println(decimalNumber);

        double hypotenuse = Math.hypot(3, 4);
        System.out.println(hypotenuse);

        /**
         * Sometimes you can mix integer variables and double variables.
         * 
         * If the result is a double, you can mix them, because integers can be treated
         * as doubles (by pretending there is a .0).
         * 
         * If the result is an integer, you can't mix them, because doubles cannot
         * automatically be treated as integers (even if the decimal part is 0).
         */
        int addInteger = 1;
        double addDouble = 2.5;
        double mixAndMatch = addDouble + addInteger;
        System.out.println(mixAndMatch);

        /**
         * There is also a variable type that can hold a single letter of text.
         * 
         * This type is called a char - short for character.
         * 
         * In order to store a letter in a char, you have to put it in single quotes.
         */
        char myChar = 'd';
        System.out.println(myChar);

        /**
         * A char can hold any single symbol - upper or lowercase letters, numbers,
         * special symbols.
         * 
         * Be aware that some symbols require a backslash (an escape character) like you
         * saw with strings.
         * 
         * For example, a backslash would be '\\' and a single quote would be '\'', and
         * so on.
         */
        char escapeChar = '\'';
        System.out.println(escapeChar);

        escapeChar = '\\';
        System.out.println(escapeChar);

        /**
         * The types you've seen so far - int, double, char - are called primitive
         * types. They represent values, and when you assign one of them to another
         * you're actually giving one variable a COPY of the other.
         */
        char firstChar = 'a';
        char secondChar = 'b';

        secondChar = firstChar;
        firstChar = 'c';
        System.out.println("This should be \'a\': " + secondChar);

        /**
         * In addition to primitive types, Java supports types called objects. In Java,
         * almost everything is an object, except for the primitive types, but even they
         * have special wrappers that are objects!
         * 
         * Java has built-in objects, and you can make your own objects (as you'll see
         * later in the course).
         * 
         * Objects are a programmatic way to represent things.
         * 
         * For now, there are just a few things to remember about objects, and we'll see
         * them as we finish this lesson.
         * 
         * One built-in Java type is the String. String variables can be used to hold
         * entire strings. Like before, you have to put all of the text inside double
         * quotes.
         */
        String stringVariable = "This is a string variable.";
        System.out.println(stringVariable);

        /**
         * Objects are different from primitives in a few important ways. One of these
         * is methods.
         * 
         * Primitive types don't have methods you can call - but objects do!
         * 
         * Methods let an object do something or provide some information about the
         * object.
         * 
         * Methods are called like this: objectName.methodName();
         * 
         * If the methods need any arguments, you put those in the parentheses.
         */
        System.out.println(stringVariable.length());
        System.out.println(stringVariable.toUpperCase());
        System.out.println(stringVariable.toLowerCase());

        /**
         * Strings are made up of characters.
         * 
         * You can access a specific character with its index (the position of the
         * character).
         * 
         * Keep in mind that the first character is in position 0. In Java and many
         * other languages, you'll often find yourself starting at 0.
         * 
         * For a string 10 characters long, the first character is at 0 and the last
         * character is at 9, but the length of the string is still 10.
         * 
         * In general, if a string is n characters long, the last character is at n - 1.
         * We can use two methods to print the last letter. If you try to get the
         * character at position n (instead of n-1), your program can crash!
         */
        System.out.println(stringVariable.charAt(0));
        System.out.println(stringVariable.charAt(stringVariable.length() - 1));

        char firstStringChar = stringVariable.charAt(0);
        int length = stringVariable.length();
        char lastStringChar = stringVariable.charAt(length - 1);
        System.out.println(firstStringChar);
        System.out.println(lastStringChar);

        /**
         * If you don't have a value to give to an object - any object, not just string,
         * you assign it a special value called null. You can assign a new value later.
         * 
         * Null is a programmatic way to say nothing, but it isn't like 0. Null means
         * there is no object, so if you try to call methods on it, the program will
         * crash!
         * 
         * You also can't print null objects (including strings). For now, understand
         * that null represents the lack of an object.
         */
        String nullString = null;
        nullString = "Not null anymore!";
        System.out.println(nullString);

        /**
         * You can also have a string with no text called the empty string. The empty
         * string is just quotes with no characters. This is more similar to the concept
         * of zero we have with integers, but it still isn't a perfect analogy.
         */
        String emptyString = "";
        System.out.println(emptyString);

        /**
         * Strings are objects that behave like primitives in a lot of ways. Be aware of
         * the differences between String and the primitive types - those will hold true
         * for other objects later. There will also be other differences we look at
         * later.
         */

        /**
         * Finally, there are a few other primitive types you might see.
         */

        /**
         * The int type represents integers, but it takes up 32 bits (or four bytes) and
         * can hold numbers between -2,147,483,648 and 2,147,483,647.
         * 
         * There are also bytes (one byte, -128 to 127), shorts (two bytes, -32,768 to
         * 32,767), and longs (eight bytes, -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807).
         */
        int intVar = 1;
        byte byteVar = 1;
        short shortVar = 1;
        long longVar = 1;
        System.out.println(intVar);
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(longVar);

        /**
         * It is possible to mix and match different types of integers, but it takes
         * special care, so we won't worry about it right now.
         * 
         * Just be aware of the types and their differences.
         */

        /**
         * There are also two types of floating point variables. The double is eight
         * bytes and can hold values as big as -1.7*10^308 to 1.7*10^308 and as small as
         * -1.7*10^3-08 to 1.7*10^-308. With a double, you get about 15 decimal places
         * of precision.
         * 
         * The float is four bytes can hold values as big as -3.4*10^38 to 3.4*10^38 and
         * as small as -3.4*10^-38 to 3.4*10^-38. With a float, you get about 7 decimal
         * places of precision.
         * 
         * By default, Java assumes any decimal number is a double, so if you want to
         * use a float variable, you have to put 'f' at the end of the number, like in
         * the example below.
         */
        double doubleVar = 1.0;
        float floatVar = 1.0000f;
        System.out.println(doubleVar);
        System.out.println(floatVar);

        /**
         * Keep in mind that you can't make these types variable names. byte, short,
         * int, long, float, double, and String are all forbidden from being variable
         * names when typed as seen in the type. You can use them as PART of a variable
         * name or change the casing, but you cannot use the exact name with the same
         * capitalization as the name.
         * 
         * You should definitely avoid using the type as a name, even with different
         * capitalization, but it is okay to use it as PART of a name.
         */

        /**
         * Finally, Java lets you put underscores between numbers to help with
         * readability. You just can't put them beside the decimal point.
         */
        int underscoreInt = 1_000_000;
        double underscoreDouble = 1_000_000.000_000_001;
        System.out.println(underscoreInt);
        System.out.println(underscoreDouble);
    }
}
