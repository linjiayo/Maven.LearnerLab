package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(Instructors.getInstance().getInstructor(0)),
    DOLIO(Instructors.getInstance().getInstructor(1));

    Instructor instructor;
    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
