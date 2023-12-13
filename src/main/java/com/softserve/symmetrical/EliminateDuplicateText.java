package com.softserve.symmetrical;

public class EliminateDuplicateText {

    private static final String SPACE = " ";
    private static final String VOID_CHART = "";

    public static String deleteDuplicateInString(String value){
        return value.toUpperCase().chars().distinct().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString().replaceAll(SPACE, VOID_CHART);
    }
}
