package com.sparta.ji;

public class FizzBuzz {

    public static String getValue(int num) {

        String answer = "";

        if (num % 3 == 0 && num % 5 == 0) {
            answer = "FizzBuzz";
        }

        else if (num % 3 == 0) {
            answer = "Fizz";

        } else if (num % 5 == 0) {
            answer = "Buzz";
        }
        return answer;
    }
}
