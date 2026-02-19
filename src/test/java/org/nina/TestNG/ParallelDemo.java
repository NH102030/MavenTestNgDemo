package org.nina.TestNG;

import org.testng.annotations.Test;

public class ParallelDemo {

        /**
         * EXAMPLE 1: Parallel Methods
         * These tests will run at the same time if configured in the XML.
         * We print the Thread ID to prove they are running on different threads.
         */
        @Test
        public void testMethod1() throws InterruptedException {
            System.out.println("Test Method 1 - Thread ID: " + Thread.currentThread().getId());
            Thread.sleep(2000); // Simulate work
        }

        @Test
        public void testMethod2() throws InterruptedException {
            System.out.println("Test Method 2 - Thread ID: " + Thread.currentThread().getId());
            Thread.sleep(2000);
        }
    }
