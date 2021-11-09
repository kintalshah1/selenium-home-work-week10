package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        String baseUrl ="https://www.barclays.co.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        String getTitle =driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
