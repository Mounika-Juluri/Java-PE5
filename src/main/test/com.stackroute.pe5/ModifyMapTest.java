package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
public class ModifyMapTest {
    ModifyMap modifyMap;
    @Before
    public void setUp() throws Exception {
        modifyMap=new ModifyMap();
    }
    @After
    public void tearDown() throws Exception {
        modifyMap=null;
    }
    @Test
    public void modifySuccess() {
        Map<String,String> mapA=new LinkedHashMap<String,String>();
        mapA.put("valOne", "java");
        mapA.put("valTwo", "c++");
        Map<String,String> mapB=new LinkedHashMap<String,String>();
        mapB.put("valOne", " ");
        mapB.put("valTwo", "java");
        Map expectedValue=mapB;
        Map actualValue=modifyMap.modify(mapA);
        assertEquals(expectedValue,actualValue);
    }
}