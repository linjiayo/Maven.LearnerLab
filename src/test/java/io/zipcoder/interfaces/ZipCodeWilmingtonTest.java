package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureByTeacherInstance() {
        Teacher teacher = new Instructor(3, "Z");
        Teacher kris = Educator.KRIS;
        Double expectedStudyHours = 2.0;
        ZipCodeWilmington instance = ZipCodeWilmington.getInstance();
        instance.hostLecture(teacher, 5);
        instance.hostLecture(kris,  5);

        for (Student s : instance.getStudents().getStudents()) {
            Double actualStudyHours = s.getTotalStudyTime();
            assertEquals(expectedStudyHours, actualStudyHours);
        }
    }

    @Test
    public void testHostLectureByInstructorId() {
        // due to static instance, account for study hours accrued in previous test
        ZipCodeWilmington instance = ZipCodeWilmington.getInstance();
        Double expectedStudyHours = 4.0;
        instance.hostLecture(0, 10);

        for (Student s : instance.getStudents().getStudents()) {
            Double actualStudyHours = s.getTotalStudyTime();
            assertEquals(expectedStudyHours, actualStudyHours);
        }
    }
}