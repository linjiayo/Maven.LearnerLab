package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.List;

public final class Students extends People {
    private final static Students INSTANCE;
    private Student[] students;

    private Students() {
        Student st1 = new Student(1, "Prof Fitru");
        Student st2 = new Student(2, "Troy");
        Student st3 = new Student(3, "Lloyd");
        Student st4 = new Student(4, "Nick");
        Student st5 = new Student(5, "Linda");
        students = new Student[] {st1, st2, st3, st4, st5};
    }
    static {
        try {
            INSTANCE = new Students();
        } catch(Exception e) {
            throw new RuntimeException("Could not create instance");
        }
    }
    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getStudents() {
        return students;
    }
}
