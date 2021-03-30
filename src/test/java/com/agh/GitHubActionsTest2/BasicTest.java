package com.agh.GitHubActionsTest2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicTest {

    private static A a;

    @BeforeClass
    public static void prepareTests() {
        a = new A();
    }

    @Test
    public void aSuccess() {
        Assert.assertEquals("String", a.getString());
    }

    @Test
    public void aFailure() {
        Assert.assertEquals("Not string", a.getString());
    }
}