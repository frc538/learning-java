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

        // Boolean values

        // Integer comparison

        // Double comparison

        // String comparison

        // And - &&

        // Or - ||

        // Not

        // Regular And - &

        // Regular Or - |

    }
}
