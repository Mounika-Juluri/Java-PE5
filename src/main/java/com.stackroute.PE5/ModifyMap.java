package com.stackroute.PE5;

import java.util.*;

public class ModifyMap {
    public Map modify(Map mapA){
        Set keylist= mapA.keySet();
        Collection valueList=mapA.values();

        Iterator itr= keylist.iterator();
        String key1=(String)itr.next();
        String key2=(String)itr.next();
        Iterator itr2= valueList.iterator();
        String val1=(String)itr2.next();
        String val2=(String)itr2.next();

        Map<String,String> map=new LinkedHashMap<>();
        map.put(key1," ");
        map.put(key2,val1);

        return map;

    }
}
