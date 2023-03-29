package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {

    @Test
    void toReturnNineForFiveAndFourAsInput()
    {
        ArithmeticOperation arithmeticObject = new ArithmeticOperation();
        int exceptedValue = 9;

        int actualValue = arithmeticObject.Add(5,4);

        assertEquals(exceptedValue,actualValue);
    }
}
