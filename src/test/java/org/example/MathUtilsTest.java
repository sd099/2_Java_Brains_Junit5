package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("Begin..........");
    }

    @AfterAll
    static void afterAllInit(){
        System.out.println("End..........");
    }

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd (){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method should add two numbers");
    }

    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"divide by zero shold tnrow");
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return the right value");
    }
}
