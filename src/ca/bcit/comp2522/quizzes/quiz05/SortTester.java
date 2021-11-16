package ca.bcit.comp2522.quizzes.quiz05;

import java.util.Random;

/**
 * SortTester profiles some sorts.
 *
 * @author YOUR NAME
 * @version 202130
 */
public final class SortTester {

    private SortTester() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        // String[] result = createStringArray(15);
    }

    /**
     * Creates and returns an array of random Integer of the
     * specified length.
     *
     * @param length an integer
     * @return array of Integer, random, of the specified length
     */
    public static Integer[] createIntegerArray(final int length) {
        Integer[] newArray = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; ++i) {
            newArray[i] = random.nextInt();
        }
        return newArray;
    }

    /**
     * Creates and returns an array of random String of the
     * specified length. Each String has five lower-case letters.
     *
     * @param length an integer
     * @return array of String, random, of the specified length
     */
    public static String[] createStringArray(final int length) {
        String[] newArray = new String[length];
        final int lowerCaseA = 97;
        final int lowerCaseZ = 122;
        final int targetStringLength = 5;
        Random random = new Random();
        for (int word = 0; word < length; ++word) {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int letter = 0; letter < targetStringLength; ++letter) {
                int randomLimitedInt =
                        lowerCaseA + (int) (random.nextFloat() * (lowerCaseZ - lowerCaseA + 1));
                buffer.append((char) randomLimitedInt);
            }
            newArray[word] = buffer.toString();
        }
        return newArray;
    }
}
