package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        Student s1 = new Student("1", "a", 14);
        Student s2 = new Student("2", "b", 15);
        Student s3 = new Student("3", "c", 16);
        Student s4 = new Student("4", "d", 18);
        Student s5 = new Student("5", "e", 16);
        List<Student> stud = new ArrayList<Student>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        stud.add(s5);
        for(Student element:stud){
            System.out.printf(element.getName()+" "+element.getId()+" "+element.getAge());
        }

        System.out.println();

        Collections.sort(stud, new StudentSorter());
        for(Student element:stud){
            System.out.printf(element.getName()+" "+element.getId()+" "+element.getAge());
        }

    }



}
