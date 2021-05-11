package Harrow_Council;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestWithChrome {

    public static void main(String[] args) {
        String string ="https://www.harrow.gov.uk/ ";
        System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals( "Home – Harrow Council" );
        System.out.println(verifyTitle);
        boolean verifyIfTitleHas = title.contains( "Council");
        System.out.println(verifyIfTitleHas);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
