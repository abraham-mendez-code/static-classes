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


}