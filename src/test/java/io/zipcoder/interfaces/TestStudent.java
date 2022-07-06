package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    Student student;

    @Before
    public void setUp() {
        student = new Student(0, 0, "F");
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testGetTotalStudyTime() {
        Double expected = 10.0;
        student.learn(10);

        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn() {
        Double expected = 20.0;
        student.learn(20);

        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}