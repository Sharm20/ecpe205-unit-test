package com.ecpe205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
    Calculator calc;

    @BeforeAll
    void setup(){
        calc = new Calculator();
    }

    //CREATE A TEST TO TEST isEven
    @Test
    void shouldCheckValueIsEven() {
        assertEquals(true,calc.isEven(2));
        assertEquals(false,calc.isEven(1));
    }

    @Test
    void shouldCheckValueIsOdd() {
        assertEquals(true,calc.isOdd(1));
        assertEquals(false,calc.isOdd(2));
    }



    @Test
    @DisplayName("Sum 2 encoded values")
    void shouldSumTwoEncodedValues() {

        // 1 + 2 = 3
        assertEquals(3, calc.sum(1,2) );
        assertEquals(9, calc.sum(5,4) );
        assertEquals(5, calc.sum(3,2) );
        assertEquals(14, calc.sum(5,9) );
    }

    @Test
    @DisplayName("testing")
    void shouldtestBaseMethod(){
        assertEquals(8, calc.base(2,3) );
        assertEquals(32, calc.base(2,5) );
        assertEquals(216, calc.base(6,3) );
        assertEquals(1, calc.base(1, 2 ));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void shouldSumValueWithOne( int value ) {
        assertEquals(value + 1, calc.sum(value, 1));
    }

    @ParameterizedTest
    @MethodSource("sumInputValues")
    void shouldSumTwoInputValues(int a, int b) {
        assertEquals(a + b, calc.sum(a, b));
    }

    @ParameterizedTest
    @MethodSource("BaseXPowerY")
    void shouldMultiplyBaseToExponent(int x, int y ){ assertEquals( Math.pow(x, y), calc.base(x, y));}

    @ParameterizedTest
    @ValueSource(ints = {3,6,9,10,12})
    void shouldGetFactorial(int a) {assertEquals(6, calc.factorial(a));}

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "nolemonnomelon", "level", "nicole", "civic" })
    void shouldKnowIfStringIsPalindrome(String n) { assertEquals(true, calc.isPalindrome(n));
    }

    static Stream<Arguments> sumInputValues () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    static Stream<Arguments> arrayOfIntegerSets () {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,1}),
                Arguments.of(new int[]{7,1,5,4,1}),
                Arguments.of(new int[]{7,2,8,3,4})
        );
    }

    static Stream<Arguments>  BaseXPowerY(){
        return Stream.of (
                    Arguments.of(2, 3),
                    Arguments.of(8, 9),
                    Arguments.of(4, 7),
                    Arguments.of(12, 3),
                    Arguments.of(9, 5)
                );
    }

}

