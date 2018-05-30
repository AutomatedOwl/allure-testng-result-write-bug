package com.github.automatedowl.bugs;

import org.testng.annotations.Test;

public class FirstExampleTest {

    @Test
    public void firstTest() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("TEST 1");
        }
    }
}
