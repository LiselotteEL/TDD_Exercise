package RegnemaskingTest_multiplication;

import Regnemaskine.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultiplicationTest {

    // fake it test
    @Test
    public void multiplication1(){

        double a = 2;
        double b = 4;

        assertEquals(8, a * b);

    }

    // test uden fake it
    @Test
    public void multiplication2(){

        Multiplication multiplication = new Multiplication();

        assertEquals(10, multiplication.simpleMultiplaction(5,2));
    }

}



