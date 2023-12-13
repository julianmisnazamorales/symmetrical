package com.softserve.symmetrical;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EliminateDuplicateTextTest {

    public static final String SIMPLE_STRING = "AABBCCD112233";

    public static final String CLEAN_STRING = "ABCD123";

    @Test
    void deleteDuplicateInString() {
        String result = EliminateDuplicateText.deleteDuplicateInString(SIMPLE_STRING);
        assertEquals(CLEAN_STRING, result);
    }
}