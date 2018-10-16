package Regnemaskine_Test.addition;


import Regnemaskine.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class AdditionTest{


    @Test
    void simpleAdd1(){
        //fake it implementation

        double a = 4;
        double b = 3;



        assertEquals(7,a + b);
    }


    @Test
    void simpleAdd2(){
        //test uden fake it

        //opretter en instans a typen Addition for at kunne anvende klassens metoder
        Addition addition = new Addition();

        /*anvender assertEquals
        add.simpleAddition betyder at den skal finde metoden simpleAddition() i klassen Addition (jeg kunne sagtens have navngivet den alt andet end 'addition'
        min metode i Addition skal kunne håndtere alle tal og lægge dem sammen
        denne test skal kunne tage imod alle tal og sammenligne dem med alle "expected" resultater
        * */
        assertEquals(7,addition.simpleAddition(3,4));
    }


}