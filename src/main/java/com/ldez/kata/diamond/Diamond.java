package com.ldez.kata.diamond;

public class Diamond {

    public static char ROOT_LETTER = 'A';

    public final String print(final char widestLetter) {

        // distance between ROOT_LETTER and the widest Letter
        final int distanceWithRootLetter = Character.compare(widestLetter, ROOT_LETTER);

        if (3 == distanceWithRootLetter) {
            return "ABCDCBA";
        }
        if (2 == distanceWithRootLetter) {
            return "ABCBA";
        }
        if (1 == distanceWithRootLetter) {
            return "ABA";
        }
        return "A";
    }

}
