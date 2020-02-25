package AmazonHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

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
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung mobile");
//        //Will delay next phase
         Thread.sleep(5000);
//        //find element that will click on the search button
       driver.findElement(By.cssSelector("input[class=\"nav-input\"][value=\"Go\"]")).click();
       Thread.sleep(4000);
//        //will relocate to previous page
       //driver.navigate().back();
       //Thread.sleep(4000);
//        //find the element and enter keys to be entered again
//        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
//        //find element that will click on the search button
//        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
//        Thread.sleep(4000);
//       click on Amazon logo to be redirected to homepage
        driver.findElement(By.xpath("//span[@class=\"nav-sprite nav-logo-base\"]")).click();
//        //click to see today's deals
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
//        Thread.sleep(4000);
//        //click on next row
//        driver.findElement(By.xpath("//*[@id=\"nextButton\"]/a/i")).click();
                //Click on category menu
            driver.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]")).click();
       Thread.sleep(5000);
//        // Close amazon menu
//        driver.findElement(By.xpath("//*[@id=\"hmenu-canvas-background\"]/div")).click();
//        //Search for Item
//        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Samsung cover");
//        //click on search button
//        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
//        //created a String variable for get Samsung cover text
//        String sCover="//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/h2/a/span";
//        //Get text
//        driver.findElement(By.xpath(sCover)).getText();
//        //output the text
//        System.out.println(driver.findElement(By.xpath(sCover)).getText());
        // will close the Browser which is active/current
        driver.close();
        // close all tab open/all the windows will close
     driver.quit();
    }
}
