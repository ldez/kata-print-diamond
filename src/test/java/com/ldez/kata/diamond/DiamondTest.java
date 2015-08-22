package com.ldez.kata.diamond;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondTest {

    @Test
    public void should_have_A_as_root_letter() throws Exception {
        assertEquals(Diamond.ROOT_LETTER, 'A');
    }

    @Test
    public void should_print_A_when_widest_letter_is_A() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('A');

        assertEquals("A", display);
    }

    @Test
    public void should_print_ABA_when_widest_letter_is_B() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('B');

        final String expected = "ABA";
        assertEquals(expected, display);
    }

    @Test
    public void should_print_ABCBA_when_widest_letter_is_C() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('C');

        final String expected = "ABCBA";
        assertEquals(expected, display);
    }

    @Test
    public void should_print_ABCDCBA_when_widest_letter_is_D() throws Exception {
        final Diamond diamond = new Diamond();

        final String display = diamond.print('D');

        final String expected = "ABCDCBA";
        assertEquals(expected, display);
    }

}
