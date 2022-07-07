package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(double totalStudyTime, long id, String name) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
