package Harrow_Council;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestWithMultiBrowser {
    static String baseUrl = "https://www.harrow.gov.uk/";
    static String checkThisWeb = "edge";
    static WebDriver driver;
    public static void main(String[] args) {
        if(checkThisWeb.equalsIgnoreCase( "chrome" )){
            System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe" );
            driver = new ChromeDriver();
        }else if(checkThisWeb.equalsIgnoreCase( "ie" )){
            System.setProperty( "webdriver.ie.driver","drivers/IEDriverServer.exe" );
            driver = new InternetExplorerDriver();
            driver.quit();

        }else if(checkThisWeb.equalsIgnoreCase( "edge" )){
            System.setProperty( "webdriver.edge.driver","drivers/msedgedriver.exe" );
            driver = new EdgeDriver();

        }else if (checkThisWeb.equalsIgnoreCase( "firefox" )){
            System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe" );
            driver = new FirefoxDriver();
        }else{
            System.out.println("you have wrong browser name");
        }driver.get( baseUrl );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        driver.close();

    }
}
