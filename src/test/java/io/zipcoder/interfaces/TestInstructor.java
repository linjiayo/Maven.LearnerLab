package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor;

    @Before
    public void setUp() {
        instructor = new Instructor(1, "T");

    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student student = new Student(0, 0,"stu");
        Double expected = 2.0;
        instructor.teach(student, 2);

        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(0, i, "s" + i);
        }
        Double expectedHours = 2.0;
        instructor.lecture(students, 8);

        for (Student student : students) {
            Double actualHours = student.getTotalStudyTime();
            Assert.assertEquals(expectedHours, actualHours);
        }
    }
}