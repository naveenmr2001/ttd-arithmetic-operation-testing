package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {

    ArithmeticOperation arithmeticObject = new ArithmeticOperation();

    @Test
    void toReturnNineForFiveAndFourAsInput()
    {
        int exceptedValue = 9;

        int actualValue = arithmeticObject.Add(5,4);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnFiveForInputOfTenAndFive(){

        int exceptedValue = 5;

        int actualValue = arithmeticObject.Subtract(10,5);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnNegativeFiveForInputOfFiveAndTen(){

        int exceptedValue = -5;

        int actualValue = arithmeticObject.Subtract(5,10);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnThreeForInputOfOneAndThree(){

        int exceptedValue = 3;

        int actualValue = arithmeticObject.Multiplication(1,3);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnNegativeThreeForInputOfOneAndNegativeThree(){

        int exceptedValue = -3;

        int actualValue = arithmeticObject.Multiplication(1,-3);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnThreeForInputOfNegativeOneAndNegativeThree(){

        int exceptedValue = 3;

        int actualValue = arithmeticObject.Multiplication(-1,-3);

        assertEquals(exceptedValue,actualValue);
    }
}
