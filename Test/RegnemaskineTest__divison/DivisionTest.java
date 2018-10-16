package RegnemaskineTest__divison;

import Regnemaskine.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DivisionTest {

    //fake it test
    @Test
    public void division1(){

        double a = 10;
        double b = 5;

        assertEquals(2, a / b);
    }

    //test with no fake it
    @Test
    public void division2(){

        Division division = new Division();

        assertEquals(10,division.simpleDivision(100,10));
    }





}
