package StepDefinitions;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.MalformedURLException;

/**
 * Created by arianapaz on 10/5/17.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }


    @Before
    /**
     * Delete all cookies at the start of each scenario
     */
    public void openBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver");
        base.Driver = new ChromeDriver();

        System.out.println("Opening Browser...." );
        base.Driver.manage().deleteAllCookies();
    }


    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + Driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException DoesnotSupportScreenshots) {
                System.err.println(DoesnotSupportScreenshots.getMessage());
            }

        }
    //    Driver.close();

    }
}
