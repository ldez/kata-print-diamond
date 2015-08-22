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

}
