package Regnemaskine_Test.addition;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class AdditionTest{

    private double tempA;
    private double tempB;
    private double tempC;
    private double tempD;

    @Test
    void simpleAdd(){
        //fake it implementation

        double a = 4;
        double b = 3;

        assertEquals(7,a + b);
    }

}