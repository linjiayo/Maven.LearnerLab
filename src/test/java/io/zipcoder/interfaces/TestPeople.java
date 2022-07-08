package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    Students people;

    @Before
    public void init() {
        people = Students.getInstance();
    }

    @After
    public void clean() {
        people.remove(0);
    }

    @Test
    public void testAdd() {
        Student person = new Student(0, "A");
        people.add(person);

        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testFindById() {
        Student person = new Student(0, "A");
        people.add(person);
        Person res = people.findById(0);
        String expectedName = "A";

        String actualName = res.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testRemoveById() {
        Student person = new Student(0, "A");
        people.add(person);
        Boolean expected = true;

        Boolean actualRemoveResult = people.remove(0);

        Assert.assertEquals(expected, actualRemoveResult);
    }

    @Test
    public void testRemoveByPerson() {
        Student person = new Student(0, "A");
        people.add(person);

        Boolean actualRemoveResult = people.remove(person);

        Assert.assertTrue(actualRemoveResult);
    }
}