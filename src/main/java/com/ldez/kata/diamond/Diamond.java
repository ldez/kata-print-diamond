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

                    // distance between current letter and root letter
                    final int distance = Character.compare(letter, ROOT_LETTER);

                    if (ROOT_LETTER == letter) {
                        line[distanceWithRootLetter] = letter;
                    } else {
                        line[distanceWithRootLetter - distance] = letter;
                        line[distanceWithRootLetter + distance] = letter;
                    }
                    return line;
                })
                // convert to String
                .map(String::valueOf)
                // aggregate letters
                .collect(Collectors.joining("\n"));
    }

}
