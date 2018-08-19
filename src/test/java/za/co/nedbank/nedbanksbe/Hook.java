package za.co.nedbank.nedbanksbe;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    private BaseDef base;

    public Hook(BaseDef base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser: NedbankSBE");

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        base.driver = new ChromeDriver();
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.driver.get(System.getProperty("test.url", "https://10.58.34.128:8443/SBE"));
        base.driver.manage().window().maximize();

    }

    @After
    public void TearDownTest(Scenario scenario) {

        System.out.println("Teardown: " + scenario.getName());

        if (scenario.isFailed()) {

            //Take screenshot
            scenario.embed(((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES), "image/png");
            System.out.println(scenario.getName());

        }

        base.driver.close();
    }

}
