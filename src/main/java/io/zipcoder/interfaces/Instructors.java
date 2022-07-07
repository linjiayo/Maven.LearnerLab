package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE;

    private Instructor[] instructor;

    private Instructors(){
        Instructor in1 = new Instructor(0, "Kris");
        Instructor in2 = new Instructor(1, "Dolio");
        instructor = new Instructor[] {in1, in2};
    }

    static {
        try {
            INSTANCE = new Instructors();
        } catch(Exception e) {
            throw new RuntimeException("Could not create instance");
        }
    }

    public static Instructors getInstance() {
        if (INSTANCE == null) {
            return new Instructors();
        }
        return INSTANCE;
    }

    public Instructor[] getInstructors() {
        return instructor;
    }

}
