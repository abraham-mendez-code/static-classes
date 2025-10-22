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


    public static String format (String prefix,
                                 String firstName,
                                 String middleName,
                                 String lastName,
                                 String suffix) {

        StringBuilder sb = new StringBuilder();

        prefix = prefix.trim();
        firstName = firstName.trim();
        middleName = middleName.trim();
        lastName = lastName.trim();
        suffix = suffix.trim();

        sb.append(lastName);
        sb.append(", ");
        sb.append(prefix);
        sb.append(" ");
        sb.append(firstName);
        sb.append(" ");
        sb.append(middleName);
        sb.append(", ");
        sb.append(suffix);

        return sb.toString();

    }



}
