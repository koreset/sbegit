package za.co.nedbank.nedbanksbe;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hook {
    private BaseDef base;

    public Hook(BaseDef base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

//        if (System.getProperty("enable.driver", "true").equals("true")) {
            System.out.println("Opening the browser: NedbankSBE");

            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_linux");
            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("start-maximized");
//            chromeOptions.addArguments("disable-gpu");
            chromeOptions.addArguments("--disable-extensions");
            base.driver = new ChromeDriver();
            base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            base.driver.get(System.getProperty("test.url", "http://localhost:4200"));
//        base.driver.manage().window().maximize();

//        }

    }

    @After
    public void TearDownTest(Scenario scenario) {

        System.out.println("Teardown: " + scenario.getName());
//        if (System.getProperty("enable.driver", "true").equals("true")) {
            if (scenario.isFailed()) {

                //Take screenshot
                scenario.embed(((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES), "image/png");
                System.out.println(scenario.getName());

            }

            base.driver.close();
        }
//    }

}
