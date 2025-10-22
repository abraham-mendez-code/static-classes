package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format_returns_lastName_firstName() {

        // arrange
        String firstName = "Mel";
        String lastName = "Johnson";
        String expectedFormat = lastName + ", " + firstName;

        // act
        String actualFormat = NameFormatter.format(firstName, lastName);

        // assert
        assertTrue(expectedFormat.equals(actualFormat));

    }

    @Test
    void format_returns_lastName_prefix_firstName_middleName_suffix() {

        // arrange
        String prefix = "Dr.";
        String firstName = "Mel";
        String middleName = "B";
        String lastName = "Johnson";
        String suffix = "PhD";
        String expectedFormat = "Johnson, Dr. Mel B, PhD";

        // act
        String actualFormat = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert
        assertTrue(expectedFormat.equals(actualFormat));

    }

}