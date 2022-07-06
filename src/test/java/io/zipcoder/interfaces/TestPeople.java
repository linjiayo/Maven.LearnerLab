package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    People people;

    @Before
    public void init() {
        people = new People();
    }

    @Test
    public void testAdd() {
        Person person = new Person(0, "A");
        people.add(person);

        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testFindById() {
        Person person = new Person(0, "A");
        people.add(person);
        Person res = people.findById(0);
        String expectedName = "A";

        String actualName = res.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testRemoveById() {
        Person person = new Person(0, "A");
        people.add(person);
        Boolean expected = true;
        Integer expectedSize = 0;

        Boolean actualRemoveResult = people.remove(0);
        Integer actualSize = people.count();

        Assert.assertEquals(expected, actualRemoveResult);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemoveByPerson() {
        Person person = new Person(0, "A");
        people.add(person);

        Boolean actualRemoveResult = people.remove(person);

        Assert.assertTrue(actualRemoveResult);
    }
}