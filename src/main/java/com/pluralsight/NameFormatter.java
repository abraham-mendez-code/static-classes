package com.pluralsight;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Arrays;

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

    //method to process individual name parts
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ");

        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }

        sb.append(firstName);

        if (!middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }

        //first issue fixed
        if(!suffix.isEmpty()){
            sb.append(", ").append(suffix);
        }


        return sb.toString();
    }

    //method to format from a string
    public static String format(String fullName) {
        //split on the comma if there
        String[] parts = fullName.split(",", 2);
        //grab the first item in the list and remove spaces
        String namePart = parts[0].trim();
        //if the length of parts is greater that one we know we had a suffix because we split on the ,
        String suffix = parts.length > 1 ? parts[1].trim() : "";

        //split the rest of the name on the space
        String[] nameTokens = namePart.split(" ");
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        //depending on the length of the array we know what name parts we have
        if (nameTokens.length == 4) {
            //fix 2
            firstName = nameTokens[1];
            prefix = nameTokens[0];
            middleName = nameTokens[2];
            lastName = nameTokens[3];
        } else if (nameTokens.length == 3) {
            firstName = nameTokens[0];
            middleName = nameTokens[1];
            lastName = nameTokens[2];
        } else if (nameTokens.length == 2) {
            firstName = nameTokens[0];
            lastName = nameTokens[1];
        }

        //call the format function above with the parts
        return format(prefix, firstName, middleName, lastName, suffix);
    }

}
