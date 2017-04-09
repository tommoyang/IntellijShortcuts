/**
 * https://www.codewars.com/kata/recursive-reverse-string
 */

public class RecursiveReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Reverse This!"));
    }

    /**
     * Use the debugger to watch what happens to a string as this function recurses
     */
    public static String reverse(String str) {
        // Put a break point on this line - click the empty space next to the line number, and a red dot should appear
        // Then run the class by pressing the "bug" button instead of the "play" button
        // Have a play with the buttons you get in the new debug window below - there are too many to describe easily
        char c = str.charAt(0);

        String n = str.substring(1, str.length());
        if (str.length() > 1) {
            n = reverse(n);
        }

        return n + c;
    }
}