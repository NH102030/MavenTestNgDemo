package org.nina.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestNgDemo {

    @Test(priority = 3)
    public void validateAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);

        // Check if 10 + 5 equals 15
        Assert.assertEquals(result, 15);
    }

    @Test(priority = 2)
    public void validateResetFunction() {
        Calculator calc = new Calculator();
        calc.setTotal(500); // Set a value
        calc.reset();       // Clear it

        // Check that the value is no longer 500
        Assert.assertNotEquals(calc.getTotal(), 500, "The total should not be 500 after reset.");
    }

    @Test(priority = 1)
    public void validateWelcomeMessage() {
        String username = "Alex";
        String actualMessage = "Welcome, " + username + "!";

        // Exact match check
        Assert.assertEquals(actualMessage, "Welcome, Alex!", "The greeting message is wrong");
    }

    @Test(priority = 100)
    public void validateInventoryStatus() {
        int stockCount = 0;
        boolean isAvailable = (stockCount > 0);

        // We expect this to be false because stock is 0
        Assert.assertFalse(isAvailable, "Product should not be available when stock is zero.");
    }

    @Test(priority = 3)
    public void validateCartSize() {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        // Кодът тук продължава според логиката на списъка...
    }

    @Test(groups = "regression")
    public void validateEmailFormat() {
        String userEmail = "testuser@gmail.com";

        // Check if the email contains the domain
        Assert.assertTrue(userEmail.contains("@gmail.com"), "The email should be a Gmail address.");
    }

}
