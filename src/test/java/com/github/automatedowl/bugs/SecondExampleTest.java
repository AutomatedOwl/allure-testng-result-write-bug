package com.github.automatedowl.bugs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondExampleTest {

    @Test
    public void secondTest() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("TEST 2");
        }
        Assert.assertTrue(false);
    }
}
