package com.stackroute.pe5;
import java.util.Comparator;
public class StudentSorter implements Comparator<Student> {
    public int compare(Student studentOne, Student StudentTwo) {
        if(studentOne.getAge()-StudentTwo.getAge()!=0){
            return studentOne.getAge()-StudentTwo.getAge();
        }else {
            int NameCompare = studentOne.getName().compareTo(StudentTwo.getName());
            return NameCompare;
        }
    }
}





