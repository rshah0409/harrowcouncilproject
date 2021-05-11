package Harrow_Council;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestWithFireFox {
    public static void main(String[] args) {
        String string = "https://www.harrow.gov.uk/";
        System.setProperty( "webdriver.gecko.driver", "drivers/geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS);
        driver.get( string );
        String title = driver.getTitle();
        System.out.println( title );
        boolean verifyTheTitle = title.equals("Home – Harrow Council");
        System.out.println( verifyTheTitle );
        boolean verifyIfTitleContain = title.contains("Home");
        System.out.println(verifyIfTitleContain);
        System.out.println( title.length() );
        String pageSource = driver.getPageSource();
        System.out.println( pageSource );
        driver.close();

    }
}
