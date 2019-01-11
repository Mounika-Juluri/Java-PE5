package com.stackroute.PE5;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetSort {
    public ArrayList<String> sort(String[] str){
        Set<String> set = new TreeSet<String>();
        for(String a:str){
            set.add(a);
        }
        ArrayList<String> list=new ArrayList<>(set);
        return list;
    }
}
