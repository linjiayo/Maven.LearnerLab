package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(Instructors.getInstance().getInstructor(0), 0),
    DOLIO(Instructors.getInstance().getInstructor(1), 0);

    public final Instructor instructor;
    public double timeWorked;
    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
