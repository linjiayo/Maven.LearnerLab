package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPerson {
    Person p;
    @Before
    public void setUp() {
        p = new Person(1, "L");
    }

    @Test
    public void testConstructor() {
        Person person = new Person(0, "J");
        String expectedName = "J";
        Long expectedId = (long) 0;

        String actualName = person.getName();
        Long actualId = person.getId();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName() {
        String expected = "L";

        String actual = p.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        String expected = "G";
        p.setName(expected);

        String actual = p.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        Long expected = (long) 1;

        Long actual = p.getId();

        assertEquals(expected, actual);
    }
}