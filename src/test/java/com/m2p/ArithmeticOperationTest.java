package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationTest{
    ArithmeticOperation arithmeticObject = new ArithmeticOperation();

    @Test
    void toReturnNineForFiveAndFourAsInput()
    {
        int exceptedValue = 9;

        int actualValue = arithmeticObject.add(5,4);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnFiveForInputOfTenAndFive(){

        int exceptedValue = 5;

        int actualValue = arithmeticObject.subtract(10,5);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnNegativeFiveForInputOfFiveAndTen(){

        int exceptedValue = -5;

        int actualValue = arithmeticObject.subtract(5,10);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnThreeForInputOfOneAndThree(){

        int exceptedValue = 3;

        int actualValue = arithmeticObject.multiply(1,3);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnNegativeThreeForInputOfOneAndNegativeThree(){

        int exceptedValue = -3;

        int actualValue = arithmeticObject.multiply(1,-3);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnThreeForInputOfNegativeOneAndNegativeThree(){

        int exceptedValue = 3;

        int actualValue = arithmeticObject.multiply(-1,-3);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnZeroForInputOfNegativeOneAndZero(){

        int exceptedValue = 0;

        int actualValue = arithmeticObject.multiply(-1,0);

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    void toReturnTwoForInputOfSixAndThree(){

        int exceptedValue = 2;

        int actualValue = arithmeticObject.divide(6,3);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnZeroForInputZeroAndFive(){

        int exceptedValue = 0;

        int actualValue = arithmeticObject.divide(0,5);

        assertEquals(exceptedValue,actualValue);

    }

    @Test
    void toReturnExceptionForInputFiveAndZero(){
        assertThrows(ArithmeticException.class,()->arithmeticObject.divide(5,0));
    }
}
