package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
/*
Write a program to implement set interface which sorts the given randomly
ordered names inascending order. Convert the sorted set in to an
array listInput : Harry  Olive  Alice  Bluto  Eugene
Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
Array list  from Set :  Alice Bluto Eugene Harry Olive
 */
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
