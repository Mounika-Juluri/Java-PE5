package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 Write a program to find the number of counts in the following  String
 Store the output inMap< String ,Integer> as key value pair.
 Input :   String  str = “one one -one___two,,three,one @three*one?two”;
 Output : {"one":5 , "two":2, "three" :2}
*/
public class StringCount {
    public Map matchString(String str){
        Map<String,Integer> mapA=new HashMap<String,Integer>();
        Pattern patternOne=Pattern.compile("one");
        Matcher matchOne=patternOne.matcher(str);
        int countone=0;
        while(matchOne.find()){
            countone++;
        }
        Pattern patternTwo=Pattern.compile("two");
        Matcher matchTwo=patternTwo.matcher(str);
        int counttwo=0;
        while(matchTwo.find()){
            counttwo++;
        }
        Pattern patternThree=Pattern.compile("three");
        Matcher matchThree=patternThree.matcher(str);
        int countthree=0;
        while(matchThree.find()){
            countthree++;
        }
        mapA.put("one", countone);
        mapA.put("two", counttwo);
        mapA.put("three", countthree);
        return mapA;
    }
}
