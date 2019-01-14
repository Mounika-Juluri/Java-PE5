package com.stackroute.pe5;
import java.util.ArrayList;
/*
Write a Java program to update specific array element by given element and empty the  array list
Array list  after removing all elements
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
*/
public class ReplaceElement {
    public ArrayList<String> replace(ArrayList<String> givenString,String[] oldStr,String[] newStr){
        int index=0;
        for (int i=0;i<givenString.size();i++){
            index=0;
            for (String a:oldStr){
                if(a.equals(givenString.get(i))){
                    givenString.set(i,newStr[index]);
                }
                index++;
            }
        }
        return givenString;
    }
}
