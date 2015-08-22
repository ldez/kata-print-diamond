package com.ldez.kata.diamond;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondAcceptanceTest {

    @Test
    public void should_print_A_when_widest_letter_is_A() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('A');

        assertEquals("A", display);
    }

    @Test
    public void should_print_ABBA_when_widest_letter_is_B() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('B');

        final String expected = " A " + System.lineSeparator() //
                + "B B" + System.lineSeparator() //
                + " A ";
        assertEquals(expected, display);
    }

    @Test
    public void should_print_ABCCBA_when_widest_letter_is_C() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('C');

        final String expected = "  A  " + System.lineSeparator() //
                + " B B " + System.lineSeparator() //
                + "C   C" + System.lineSeparator() //
                + " B B " + System.lineSeparator() //
                + "  A  ";
        assertEquals(expected, display);
    }

    @Test
    public void should_print_ABCDDCBA_when_widest_letter_is_D() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('D');

        final String expected = "   A   " + System.lineSeparator() //
                + "  B B  " + System.lineSeparator() //
                + " C   C " + System.lineSeparator() //
                + "D     D" + System.lineSeparator() //
                + " C   C " + System.lineSeparator() //
                + "  B B  " + System.lineSeparator() //
                + "   A   ";
        assertEquals(expected, display);
    }

}
