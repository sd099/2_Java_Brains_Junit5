package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

//    @Test
//    void test(){
//        System.out.println("Hi");
//    }
//    @Test
//    void test1(){
//        System.out.println("Hi2");
//    }
//    @Test
//    void test2(){
//        fail("Hi2");
//    }

    @Test
    void testAdd (){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method should add two numbers");
    }

    @Test
    void testDivide(){
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"divide by zero shold tnrow");
    }

    @Test
    void testComputeCircleArea(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return the right value");
    }
}
