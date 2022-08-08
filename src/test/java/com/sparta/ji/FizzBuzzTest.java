package com.sparta.ji;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    @DisplayName("Verify divisible by 3 returning Fizz")
    public void verifyingDivisibleBy3ReturningFizz(){
        Assertions.assertEquals("Fizz",FizzBuzz.getValue(3));
    }

    @Test
    @DisplayName("Verify divisible by 5 returning Buzz")
    public void verifyingDivisibleBy5ReturningFizz(){
        Assertions.assertEquals("Buzz",FizzBuzz.getValue(5));
    }

    @Test
    @DisplayName("Verify divisible by 15 returning FizzBuzz")
    public void verifyingDivisibleBy15ReturningFizzBuzz(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.getValue(15));
    }
}
