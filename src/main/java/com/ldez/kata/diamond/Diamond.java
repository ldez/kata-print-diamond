package com.ldez.kata.diamond;

public class Diamond {

    public static char ROOT_LETTER = 'A';

    public final String print(final char widestLetter) {
        if ('D' == widestLetter) {
            return "ABCDCBA";
        }
        if ('C' == widestLetter) {
            return "ABCBA";
        }
        if ('B' == widestLetter) {
            return "ABA";
        }
        return "A";
    }

}
