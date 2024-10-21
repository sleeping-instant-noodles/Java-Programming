import java.util.Random;

public class RandomCharacter {

    // Use a single instance of Random to avoid creating multiple instances
    private static final Random random = new Random();

    /**
     * Generate a random character between ch1 and ch2 inclusive.
     *
     * @param ch1 the start character (inclusive)
     * @param ch2 the end character (inclusive)
     * @return a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        // Ensure ch1 is less than or equal to ch2
        if (ch1 > ch2) {
            throw new IllegalArgumentException("ch1 must be less than or equal to ch2");
        }
        return (char) (ch1 + random.nextInt((int) (ch2 - ch1 + 1)));
    }

    /**
     * Generate a random lowercase letter.
     *
     * @return a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter.
     *
     * @return a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Simple test class to demonstrate the usage of RandomCharacter methods
    public static void main(String[] args) {
        System.out.println("Random Lowercase Letter: " + getRandomLowerCaseLetter());
        System.out.println("Random Uppercase Letter: " + getRandomUpperCaseLetter());
        System.out.println("Random Character between '5' and '9': " + getRandomCharacter('5', '9'));

        // Uncomment the following line to see the exception handling in action
        // System.out.println("Random Character between 'z' and 'a': " + getRandomCharacter('z', 'a'));
    }
}
