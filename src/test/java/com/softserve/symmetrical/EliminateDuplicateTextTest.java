package com.softserve.symmetrical;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EliminateDuplicateTextTest {

    public static final String SIMPLE_STRING = "AABBCCD112233";

    public static final String SIMPLE_LOWER_STRING = "AaBbCCD112233";

    public static final String SIMPLE_TRIM_STRING = "Aa Bb CC D112233";

    public static final String CLEAN_STRING = "ABCD123";

    @Test
    void deleteDuplicateInStringTest() {
        String result = EliminateDuplicateText.deleteDuplicateInString(SIMPLE_STRING);
        assertEquals(CLEAN_STRING, result);
    }

    @Test
    void deleteDuplicateInStringLowerTest() {
        String result = EliminateDuplicateText.deleteDuplicateInString(SIMPLE_LOWER_STRING);
        assertEquals(CLEAN_STRING, result);
    }

    @Test
    void deleteDuplicateInStringTrimTest() {
        String result = EliminateDuplicateText.deleteDuplicateInString(SIMPLE_TRIM_STRING);
        assertEquals(CLEAN_STRING, result);
    }

    @Test
    void noDeleteDuplicateInStringTrimTest() {
        String result = EliminateDuplicateText.deleteDuplicateInString(SIMPLE_TRIM_STRING);
        assertNotEquals("CLEAN_STRING", result);
    }
}