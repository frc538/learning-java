/**
 * In Java, all files should belong to a package.
 * The name of the package is made of directories.
 * 
 * Package names start with the first directory inside 
 * the src/main/java directory and include any sub-folders,
 * separated by period.
 * 
 * This file lives in the src/main/java/printing directory, so its package
 * is printing. Every file should have its package listed at the
 * top of the file.
 * 
 * Be aware that the exact structure of a Java project can vary,
 * but our projects will look like this.
 */
package printing;

/**
 * In Java, everything is treated as an object.
 * 
 * Every .java file defines one of these objects as a blueprint.
 * In this case (and in most) this blueprint is called a class.
 * 
 * The name of the class must be the same as the name of the file.
 * 
 * In this case, the class's name is App, so the file 
 * must be App.java.
 */
public class App {
    /**
     * In order for a Java program to run, 
     * there must be an entry-point.
     * 
     * This entry-point is the main method. A method is 
     * something that is part of a class that can 
     * perform some action. The main method is a special
     * one of these methods.
     * 
     * When a Java program runs, it looks for the main method
     * that looks like this one to call.
     * 
     * For now, all of the code you write will go
     * in this special, main method.
     */
    public static void main(String[] args) throws Exception {
        /**
         * In a Java program, you can create a line of text
         * using the println function.
         * 
         * println is a method, like main. It lives on out, which
         * is an object, like App. out is a part of the System class.
         * 
         * In Java, we use the . (dot, decimal) to access objects on
         * other objects (like out on System) or to call methods 
         * on objects (like println on out).
         * 
         * Methods (like println) must have parentheses at the end
         * when we call them, but those parentheses can be empty.
         * 
         * Finally, most lines in Java end in a semicolon (;), especially
         * lines that DO something (rather than check or define something).
         * 
         * These lines ending in semicolons are called statements.
         */
        System.out.println();

        /**
         * In Java, lines that are not executed are called comments.
         * 
         * Comments, like this one, are meant to provide information
         * about the code to anyone who reads it.
         */

        /**
         * Comments can look like this (multi-line), where the block
         * starts with a forward slash and asterisk and ends with 
         * an asterisk and forward slash. All other asterisks are
         * for formatting.
         */

        // Single line comments look like this and start with two forward slashes.

        /**
         * Instead of printing a blank line, you can print
         * text using what is called a string literal.
         * 
         * A string literal is a chunk of text inside quotes.
         * 
         * For example: "This is a string literal."
         * 
         * A string literal can be placed inside the parentheses
         * of the println method. This makes it an argument,
         * data that is passed from one part of the program
         * to the method.
         */
        System.out.println("Hello world!");

        /**
         * You can combine multiple string literals together
         * using the + symbol. This process is called
         * concatenation - just make sure you include
         * all the spaces you need.
         */
        System.out.println("This string literal " + "is split across" + " multiple strings");

        /**
         * There are some special characters that need a backslash
         * before you print them.
         * - \" includes one quote (called a double quote) sign INSIDE the text.
         * - \\ includes a single backslash inside the text.
         * - \' includes an apostrophe (AKA single quote) inside the text.
         * 
         * We have to use the backslash before a quote because we use
         * quotes to say when strings start and stop.
         * 
         * We have to use the backslash before a backslash because we use
         * backslashes to identify special characters.
         * 
         * The apostrophe (single quote) is a special case. We don't need
         * to mark it in strings, but there are other times where it
         * has to be marked, so we're including it here.
         * 
         * This process of using a backslash to indicate a special 
         * character is called escaping.
         */
        System.out.println("A double quote: \". A backslash: \\. A single quote: \'.");

        /**
         * Finally, there are some other escaped characters that can
         * help with how your text appears.
         * 
         * - \t adds a tab in the text
         * - \n add a new line in the text
         */
        System.out.println("\tThis is the first line, indented.\nAnd this is a second line.");

        /**
         * The println method is handy because it lets you print lines of text.
         * There is another method called print that does almost exactly
         * the same thing.
         * 
         * The difference is this:
         * - When println is finished, it creates a new line for the next call to print on
         * - When print is finished, the next call (print or println) will continue on the same line
         * 
         * Otherwise, the two are exactly the same from our perspective.
         */
        System.out.print("This is printed on one line.");
        System.out.print(" And this continues on the same line.");
        System.out.println(" And even this is on the same line!");
        System.out.print("This is a new line, though.");
        System.out.println(" This is still on the second line.");
        System.out.println("And this is a third line.");        
    }
}