package com.ldez.kata.diamond;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {

    public static char ROOT_LETTER = 'A';

    public final String print(final char widestLetter) {

        // distance between ROOT_LETTER and the widest Letter
        final int distanceWithRootLetter = Character.compare(widestLetter, ROOT_LETTER);

        return IntStream.rangeClosed(-distanceWithRootLetter, distanceWithRootLetter)
                // compute distance
                .map(number -> distanceWithRootLetter - Math.abs(number))
                // convert distance to character
                .mapToObj(distance -> (char) (ROOT_LETTER + distance))
                // convert to String
                .map(String::valueOf)
                // aggregate letters
                .collect(Collectors.joining("\n"));
    }

}
