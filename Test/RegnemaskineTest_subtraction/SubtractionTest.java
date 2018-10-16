package RegnemaskineTest_subtraction;

import Regnemaskine.Subtraction;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractionTest {


    @Test
    public void simpleSubtract1() {

        double a = 10;
        double b = 5;


        assertEquals(5,a - b);

    }


    @Test
    public void simpleSubtract2(){

        Subtraction subtraction = new Subtraction();

        assertEquals(5,subtraction.simpleSubtraktion(10,5));

    }


}