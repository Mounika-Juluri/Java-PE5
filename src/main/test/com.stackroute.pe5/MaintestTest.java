package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class MaintestTest {
    Maintest mainTest;
    @Before
    public void setUp() throws Exception {
        mainTest=new Maintest();
    }
    @After
    public void tearDown() throws Exception {
        mainTest=null;
    }
    @Test
    public void studentSort() {
        Student studentOne = new Student("1", "a", 14);
        Student studentTwo = new Student("2", "b", 15);
        Student studentThree = new Student("3", "c", 16);
        Student studentFour = new Student("4", "d", 18);
        Student studentFive = new Student("5", "e", 16);
        ArrayList<Student> givenStudent = new ArrayList<Student>();
        givenStudent.add(studentOne);
        givenStudent.add(studentTwo);
        givenStudent.add(studentThree);
        givenStudent.add(studentFour);
        givenStudent.add(studentFive);
        ArrayList<Student> expectedStudent = new ArrayList<Student>();
        expectedStudent.add(studentOne);
        expectedStudent.add(studentTwo);
        expectedStudent.add(studentThree);
        expectedStudent.add(studentFive);
        expectedStudent.add(studentFour);
        ArrayList expectedValue=expectedStudent;
        ArrayList actualValue=mainTest.studentSort(givenStudent);
        assertEquals(expectedValue,actualValue);
    }
}