package org.nina.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {

    private static final By usernameField = By.cssSelector("#defaultLoginFormUsername");
    private static final By passwordFiels = By.cssSelector("#defaultLoginFormPassword");
    private static final By signInButton = By.cssSelector("form .btn-primary");
    private static final By signOutIcon = By.cssSelector((".fa-sign-out-alt"));

  @Test
    public void myFirstTest () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4200/users/login");
        Thread.sleep(2000);
        //driver.findElement(usernameField).sendKeys("myUserName");

        WebElement usernameFieldElement = driver.findElement(usernameField);
        usernameFieldElement.sendKeys("123@mail.bg");
        Thread.sleep(2000);

        System.out.println("The text is: "+ usernameFieldElement.getText());
        System.out.println("The value attribute is: "+ usernameFieldElement.getAttribute("value"));
        System.out.println("The placeholder attribute is: "+ usernameFieldElement.getAttribute("placeholder"));
        Thread.sleep(1000);

        WebElement passwordFieldElement = driver.findElement(passwordFiels);
        passwordFieldElement.sendKeys("123@mail.bg");
        Thread.sleep(2000);

        WebElement signInButtonElement = driver.findElement(signInButton);
        signInButtonElement.click();
        Thread.sleep(5000);

        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://training.skillo-bg.com:4200/posts/all", actualUrl);
        driver.findElement(signOutIcon);
        driver.quit();
    }
}
