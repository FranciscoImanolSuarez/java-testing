package com.platzi.javatests.fizzbuzz;

public class FizzBuzz {
    private String result = "";

    public String fizzBuzz(int n) {
        if (n % 3 == 0) {
            result = "Fizz";
        }
        if (n % 5 == 0) {
            result = "Buzz";
        }

        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        }
        return result;
    }
}
