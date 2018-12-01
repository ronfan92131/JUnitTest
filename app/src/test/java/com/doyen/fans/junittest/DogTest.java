package com.doyen.fans.junittest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog = new Dog("Cookie", "Chiwawa", 8);

    @Test
    public void getName() {
        Assert.assertEquals("Cookie", dog.getName());
    }

    @Test
    public void getDescription() {
        Assert.assertEquals("Chiwawa", dog.getDescription());
    }

    @Test
    public void getWeight() {
        Assert.assertEquals(8, dog.getWeight());
    }

    @Test
    public void showTime() {

    }
}