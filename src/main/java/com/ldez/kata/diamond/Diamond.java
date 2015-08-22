package com.ldez.kata.diamond;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {

    public static char ROOT_LETTER = 'A';

    public final String print(final char widestLetter) {

        // distance between ROOT_LETTER and the widest Letter
        final int distanceWithRootLetter = Character.compare(widestLetter, ROOT_LETTER);

        // square size : total number of rows == length of a line
        final int squareSize = distanceWithRootLetter * 2 + 1;

        return IntStream.rangeClosed(-distanceWithRootLetter, distanceWithRootLetter)
                // compute distance
                .map(number -> distanceWithRootLetter - Math.abs(number))
                // convert distance to character
                .mapToObj(distance -> (char) (ROOT_LETTER + distance))
                // build a line
                .map(letter -> {
                    final char[] line = new char[squareSize];
                    // Fill for replace 'null' character with space character
                    Arrays.fill(line, ' ');

                    if (ROOT_LETTER == letter) {
                        line[0] = letter;
                    } else {
                        line[0] = letter;
                        line[1] = letter;
                    }
                    return line;
                })
                // convert to String
                .map(String::valueOf)
                // aggregate letters
                .collect(Collectors.joining("\n"));
    }

}
