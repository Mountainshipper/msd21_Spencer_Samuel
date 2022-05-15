package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JUnitTests {

    private Calculator calc;
    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

// ADD
    @Test
    public void calcTestADD1(){
        Assertions.assertEquals(20, calc.add(15.0, 5));
    }
    @Test
    public void calcTestAD2(){
        Assertions.assertEquals(15 + 5, calc.add(15, 5));
    }


//Minus
    @Test
    public void calcTestMinus1(){
        Assertions.assertEquals(35, calc.minus(40, 5));
    }
    @Test
    public void calcTestMinus2(){
        Assertions.assertEquals(35-5, calc.minus(35, 5));
    }


//Multiply
    @Test
    public void calcTestMultiply1(){
        Assertions.assertEquals(15, calc.multiply(3, 5));
    }
    @Test
    public void calcTestMultiply2(){
        Assertions.assertEquals(3*5, calc.multiply(3, 5));
    }


    //Divide
    @Test
    public void calcTestDivide1(){
        Assertions.assertEquals(3, calc.divide(6, 2));
    }
    @Test
    public void calcTestDivide2(){
        Assertions.assertEquals(6/2, calc.divide(6, 2));
    }


    }


