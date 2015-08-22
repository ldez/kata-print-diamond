package com.ldez.kata.diamond;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondTest {

    @Test
    public void should_have_A_as_root_letter() throws Exception {
        assertEquals(Diamond.ROOT_LETTER, 'A');
    }

}
