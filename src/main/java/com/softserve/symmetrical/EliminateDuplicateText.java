package com.softserve.symmetrical;

public class EliminateDuplicateText {

    public static String deleteDuplicateInString(String value){
        return value.toUpperCase().chars().distinct().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString().replaceAll(" ", "");
    }
}
