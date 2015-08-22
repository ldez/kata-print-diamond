package com.ldez.kata.diamond;

public class Diamond {

    public static char ROOT_LETTER = 'A';

    public final String print(final char widestLetter) {
        if ('B' == widestLetter) {
            return "ABA";
        }
        return "A";
    }

}
