package com.stackroute.PE5;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCount {
    public Map matchString(String str){

        Map<String,Integer> mapA=new HashMap<String,Integer>();

        Pattern ptr1=Pattern.compile("one");
        Matcher m1=ptr1.matcher(str);

        int countone=0;
        while(m1.find()){
            countone++;
        }

        Pattern ptr2=Pattern.compile("two");
        Matcher m2=ptr2.matcher(str);
        int counttwo=0;

        while(m2.find()){
            counttwo++;
        }
        Pattern ptr3=Pattern.compile("three");
        Matcher m3=ptr3.matcher(str);
        int countthree=0;
        while(m3.find()){
            countthree++;
        }
        mapA.put("one", countone);
        mapA.put("two", counttwo);
        mapA.put("three", countthree);
        return mapA;

    }
}
