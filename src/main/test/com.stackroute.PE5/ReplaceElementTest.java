package com.stackroute.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceElementTest {
    ReplaceElement replaceElement;
    @Before
    public void setUp() throws Exception {
        replaceElement=new ReplaceElement();
    }

    @After
    public void tearDown() throws Exception {
        replaceElement=null;
    }

    @Test
    public void replaceSuccess() {
        ArrayList<String> strExpect=new ArrayList<>();
        strExpect.add("Kiwi");
        strExpect.add("Grape");
        strExpect.add("Mango");
        strExpect.add("Berry");

        ArrayList<String> strpass=new ArrayList<>();
        strpass.add("Apple");
        strpass.add("Grape");
        strpass.add("Melon");
        strpass.add("Berry");
        String[] oldStr = {"Apple", "Melon"};
        String[] newStr = {"Kiwi", "Mango"};
        ArrayList<String> expectedValue=strExpect;
        ArrayList<String> actualValue=replaceElement.replace(strpass,oldStr,newStr);
        assertArrayEquals(expectedValue.toArray(),actualValue.toArray());

    }
}