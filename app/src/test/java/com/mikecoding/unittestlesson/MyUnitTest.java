package com.mikecoding.unittestlesson;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MyUnitTest {

    //divide test into three parts is good standard
    //before testing
    //when testing
    //after testing

    @Test
    public void canConcatenate(){
        //given
        MyUnit myUnit = new MyUnit("One", "Two");

        //when
        String result = myUnit.concatenate();

        //then
        assertEquals("Wrong concatenation ","OneTwo", result);

    }
    @Test
    public void canSubtract(){
        MyUnit myUnit = new MyUnit("David", "ett");
        MyUnit str0neShorter = new MyUnit("Ett", "David");
        String result = myUnit.subtract();
        String res = str0neShorter.subtract();

        assertEquals("Wrong subtraction ", "id", result);
        assertEquals("Wrong subtraction ", "", res);

    }
}
