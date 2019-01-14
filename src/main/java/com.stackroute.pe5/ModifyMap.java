package com.stackroute.pe5;
import java.util.*;
/*
Write a method that accepts a Map object having two key-value pairs
 the keys val1 and val2.Modify and return the given map as follows:
 a. If the key `val1` has a value, set the key `val2` to have that value, and
 b. Set the key `val1` to have the value `"  "` (empty string ).
 Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
 Example 2:The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":"mars"}
 */
public class ModifyMap {
    public Map modify(Map mapA){
        Set keylist= mapA.keySet();
        Collection valueList=mapA.values();
        Iterator iterationOne= keylist.iterator();
        String keyOne=(String)iterationOne.next();
        String keyTwo=(String)iterationOne.next();
        Iterator iterationTwo= valueList.iterator();
        String valOne=(String)iterationTwo.next();
        String valTwo=(String)iterationTwo.next();
        Map<String,String> map=new LinkedHashMap<>();
        map.put(keyOne," ");
        map.put(keyTwo,valOne);
        return map;
    }
}
