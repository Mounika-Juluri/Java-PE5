package com.stackroute.PE5;
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
        String str1="harry olive eugene bluto alice";
        String[] str=str1.split("\\s");
        ArrayList<String> set = new ArrayList<String>();
        set.add("alice");
        set.add("bluto");
        set.add("eugene");
        set.add("harry");
        set.add("olive");
        ArrayList<String> expectedValue=set;
        ArrayList<String> actualValue=setSort.sort(str);
        assertEquals(expectedValue,actualValue);
    }
}