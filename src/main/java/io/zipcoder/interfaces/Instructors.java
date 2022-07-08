package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE;

    private Instructors(){
        Instructor in1 = new Instructor(0, "Kris");
        Instructor in2 = new Instructor(1, "Dolio");
        personList = new ArrayList<>(Arrays.asList(in1, in2));
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

    public List<Instructor> getInstructors() {
        return personList;
    }

    public Instructor getInstructor(long id) {
        for (Instructor ins : INSTANCE.toArray()) {
            if (ins.getId() == id) {
                return ins;
            }
        }
        return null;
    }
    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }

}
