package org.example;

import org.junit.jupiter.api.*;

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

    @Nested
    class testAdd{
        @Test
        @DisplayName("Testing add method for +ve")
        void testPositive (){
            int expected = 2;
            int actual = mathUtils.add(1,1);
            assertEquals(expected,actual,"The add method should add two numbers");
        }
        @Test
        @DisplayName("Testing add method for -ve")
        void testNegative (){
            assertEquals(-2,mathUtils.add(-1,-1),"The add method should add two numbers");
        }
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide(){
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"divide by zero shold tnrow");
    }

    @Test
    @DisplayName("Testing Circle area method")
    void testComputeCircleArea(){
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return the right value");
    }

//    @Test
//    @Disabled
//    @DisplayName("Should Not Run")
//    void testDisabled(){
//        fail("Hello.....");
//    }
}
