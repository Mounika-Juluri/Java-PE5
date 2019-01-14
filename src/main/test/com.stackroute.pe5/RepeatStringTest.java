package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class RepeatStringTest {
    RepeatString repeatString;
    @Before
    public void setUp() throws Exception {
        repeatString=new RepeatString();
    }
    @After
    public void tearDown() throws Exception {
        repeatString=null;
    }
    @Test
    public void countRepeatSuccess() {
        Map<String,Boolean> mapA = new HashMap<>();
        mapA.put("a",true);
        mapA.put("b",false);
        mapA.put("c",true);
        mapA.put("d",false);
        String givenString="a b c d a c c";
        String[] string=givenString.split("\\s");
        Map expectedValue=mapA;
        Map actualValue=repeatString.countRepeat(string);
        assertEquals(expectedValue,actualValue);
    }
}