package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

    @Test
    public void testInfiniteLoop() throws TimeoutException {
        // This test should fail as the infiniteLoop method enters an infinite loop
        try {
            long timeoutMillis = 1000; // Set timeout to 1 second
            long startTime = System.currentTimeMillis();

            App.infiniteLoop(Double.POSITIVE_INFINITY);

            long elapsedTime = System.currentTimeMillis() - startTime;
            
            // If the method doesn't enter an infinite loop, throw TimeoutException
            if (elapsedTime >= timeoutMillis) {
                throw new TimeoutException("Test did not complete within the specified timeout.");
            }
        } catch (Throwable e) {
            // The test should fail if any exception is caught
            assertTrue("Expected TimeoutException but got " + e.getClass().getSimpleName(), e instanceof TimeoutException);
        }
}
