package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Write a program where an array of strings is input and
output is a Map< String ,boolean> where each different
string  is a key and its value is true if that  string
appears 2 or more times in the arrayInput : String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
public class RepeatString {
    public Map countRepeat (String[] givenString){
        String combine="";
        for(String b:givenString){
            combine=combine+b+"";
        }
        Map<String,Boolean> mapA=new HashMap<String,Boolean>();
        for(String a:givenString){
            Pattern patternOne=Pattern.compile(a);
            Matcher match=patternOne.matcher(combine);
            int count=0;
            while(match.find()){
                count++;
            }
            if(count>=2)
                mapA.put(a,true);
            else
                mapA.put(a,false);
        }
        return mapA;
    }
}
