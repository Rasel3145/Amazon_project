package AmazonHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {
    static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
        // create a object for chromeDriver
        WebDriver driver = new ChromeDriver();
        //driver.get(url);
        driver.navigate().to(url);
        //Will maximize the window
        driver.manage().window().maximize();
        //find the element and enter keys to be entered
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Samsung");
        //Will delay next phase
        Thread.sleep(5000);
        //find element that will click on the search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        //will relocate to previous page
        driver.navigate().back();
        //find the element and enter keys to be entered again
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
        //find element that will click on the search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
       Thread.sleep(4000);
        //click on Amazon logo to be redirected to homepage
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();





































        // will close the Browser which is active/current
        driver.close();
        // close all tab open/all the windows will close
        //driver.quit();
    }
}
