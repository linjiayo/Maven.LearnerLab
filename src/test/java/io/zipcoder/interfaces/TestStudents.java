package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudentsSingleton() {
        Students students = Students.getInstance();
        Student[] studentsArr = students.getStudents();

        for (int i = 0; i < studentsArr.length; i++) {
            long expectedId = i + 1;

            long actualId = studentsArr[i].getId();
            Assert.assertEquals(expectedId, actualId);
        }
    }
}