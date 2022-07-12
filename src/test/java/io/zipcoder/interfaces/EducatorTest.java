package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testTeach() {
        Student student = new Student(0, 0,"stu");
        Educator kris = Educator.KRIS;
        Double expected = 2.0;
        kris.teach(student, 2);

        Double actual = kris.getTimeWorked();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Educator dolio = Educator.DOLIO;
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(0, i, "s" + i);
        }
        Double expectedHoursPerStudent = 2.0;
        Double expectedHoursTaught = 8.0;
        dolio.lecture(students, 8);
        Double actualHoursTaught = dolio.getTimeWorked();


        for (Student student : students) {
            Double actualHours = student.getTotalStudyTime();
            Assert.assertEquals(expectedHoursPerStudent, actualHours);
        }
        Assert.assertEquals(expectedHoursTaught, actualHoursTaught);
    }

}