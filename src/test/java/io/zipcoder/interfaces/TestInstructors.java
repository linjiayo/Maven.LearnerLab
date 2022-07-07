package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void testInstructors() {
        Instructor[] instructors = Instructors.getInstance().getInstructors();
        String expectedName1 = "Kris";
        String expectedName2 = "Dolio";

        String actualName1 = instructors[0].getName();
        String actualName2 = instructors[1].getName();

        Assert.assertEquals(expectedName1, actualName1);
        Assert.assertEquals(expectedName2, actualName2);

    }
}