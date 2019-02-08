package FBtest;

import Utilities.CapScreenSht;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FbStepDef {
    WebDriver driver;
    CapScreenSht sc =new CapScreenSht();

    @Given("^I initiate the chrome browser$")
    public void i_initiate_the_chrome_browser() throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\IdeaProjects\\FBLogin\\src\\test\\java\\Utilities\\chromedriver.exe");
 driver=new ChromeDriver();

    }

    @Given("^I opened google$")
    public void i_opened_google() throws Throwable {
 driver.get("https://www.facebook.com/");
    }

    @Then("^I opened facebook$")
    public void i_opened_facebook() throws Throwable {
        System.out.println("I am in Facebook Homepage");
        driver.getClass();


    }

    @Then("^I entered valid username and pass$")
    public void i_entered_valid_username_and_pass() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("srinivas.che2009@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("prahi@123");
        driver.findElement(By.id("u_0_2")).click();
        driver.manage().window().wait(5);
        sc.capScrSht(driver,"abs");

        driver.quit();
    }

}
