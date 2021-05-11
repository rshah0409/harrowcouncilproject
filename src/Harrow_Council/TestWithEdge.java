package Harrow_Council;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class TestWithEdge {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get( baseUrl );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyThisTitle = title.equals( "Home – Harrow Council" );
        System.out.println(verifyThisTitle);
        boolean checkTitleContains = title.contains( "address" );
        System.out.println(title.length());
        System.out.println(checkTitleContains);
        String source = driver.getPageSource();
        System.out.println(source);
        driver.close();
    }

}
