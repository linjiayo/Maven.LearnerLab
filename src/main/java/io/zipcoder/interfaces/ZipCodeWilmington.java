package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE;
    private static final Students students;
    private static final Instructors instructors;

    private ZipCodeWilmington() {}
    static {
        try {
            INSTANCE = new ZipCodeWilmington();
            students =  Students.getInstance();
            instructors = Instructors.getInstance();
        } catch(Exception e) {
            throw new RuntimeException("Could not create instance");
        }
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
    protected void hostLecture(Teacher teacher, double numberOfHOurs) {
        teacher.lecture(students.toArray(), numberOfHOurs);
    }

    protected void hostLecture(long id, double numberOfHours) {
        Instructor in = instructors.getInstructor(id);
        in.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Student[] studentArr = students.toArray();
        Map<Student, Double> res = new HashMap<>();
        for (Student s : studentArr) {
            res.put(s, s.getTotalStudyTime());
        }
        return res;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

}
