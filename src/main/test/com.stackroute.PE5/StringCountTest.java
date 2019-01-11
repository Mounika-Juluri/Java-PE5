package com.stackroute.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;
    @Before
    public void setUp() throws Exception {
        stringCount=new StringCount();
    }


    @After
    public void tearDown() throws Exception {
        stringCount=null;
    }

    @Test
    public void matchStringSuccess() {
        Map <String,Integer> mapA = new HashMap<>();
        mapA.put("one",5);
        mapA.put("two",2);
        mapA.put("three",2);
        String str="one one -one____two,,three,one @three*one?two";
        Map expectedValue=mapA;
        Map actualValue=stringCount.matchString(str);
        assertEquals(expectedValue,actualValue);

    }
}