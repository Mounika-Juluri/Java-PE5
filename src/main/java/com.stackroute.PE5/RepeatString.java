package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatString {
    public Map countRepeat (String[] str){
        String combine="";
        for(String b:str){
            combine=combine+b+"";
        }
        Map<String,Boolean> mapA=new HashMap<String,Boolean>();
        for(String a:str){
            Pattern ptr2=Pattern.compile(a);
            Matcher m2=ptr2.matcher(combine);
            int count=0;
            while(m2.find()){
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
