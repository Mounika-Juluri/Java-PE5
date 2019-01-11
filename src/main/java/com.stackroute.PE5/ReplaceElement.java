package com.stackroute.PE5;

import java.util.ArrayList;

public class ReplaceElement {
    public ArrayList<String> replace(ArrayList<String> str,String[] oldStr,String[] newStr){
        int index=0;
        for (int i=0;i<str.size();i++){
            index=0;
            for (String a:oldStr){

                if(a.equals(str.get(i))){
                    str.set(i,newStr[index]);
                }
                index++;
            }
        }
        return str;

    }
}
