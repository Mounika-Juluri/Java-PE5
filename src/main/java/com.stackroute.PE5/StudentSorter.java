package com.stackroute.PE5;
import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student a, Student b) {
        if(a.getAge()-b.getAge()!=0){
            return a.getAge()-b.getAge();
        }else {
            int NameCompare = a.getName().compareTo(b.getName());

            return NameCompare;
        }

    }

}





