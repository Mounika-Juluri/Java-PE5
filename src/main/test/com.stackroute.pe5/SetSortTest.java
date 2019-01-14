package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;
public class SetSortTest {
    SetSort setSort;
    @Before
    public void setUp() throws Exception {
        setSort=new SetSort();
    }
    @After
    public void tearDown() throws Exception {
        setSort=null;
    }
    @Test
    public void setSortrepeatSuccess(){
        String stringOne="harry olive eugene bluto alice";
        String[] string=stringOne.split("\\s");
        ArrayList<String> set = new ArrayList<String>();
        set.add("alice");
        set.add("bluto");
        set.add("eugene");
        set.add("harry");
        set.add("olive");
        ArrayList<String> expectedValue=set;
        ArrayList<String> actualValue=setSort.sort(string);
        assertEquals(expectedValue,actualValue);
    }
}