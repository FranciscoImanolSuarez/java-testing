package com.platzi.javatests.fizzbuzz;

import com.platzi.javatests.discounts.PriceCalculator;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTestShould {
    @Test
    public void is_divisible_by_3(){
        FizzBuzz result = new FizzBuzz();

        assertThat(result.fizzBuzz(3), CoreMatchers.is("Fizz"));
    }
    @Test
    public void is_divisible_by_5(){
        FizzBuzz result = new FizzBuzz();

        assertThat(result.fizzBuzz(5), CoreMatchers.is("Buzz"));
    }

    @Test
    public void is_divisible_by_3_and_5(){
        FizzBuzz result = new FizzBuzz();

        assertThat(result.fizzBuzz(15), CoreMatchers.is("FizzBuzz"));
    }
}