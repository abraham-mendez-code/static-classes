package com.pluralsight;

import java.util.ArrayList;

public class NameFormatter {

    private NameFormatter() {
    }

    public static String format (String firstName,
                                 String lastName) {
        StringBuilder sb = new StringBuilder();

        firstName = firstName.trim();
        lastName = lastName.trim();

        sb.append(lastName);
        sb.append(", ");
        sb.append(firstName);

        return sb.toString();
    }



}
