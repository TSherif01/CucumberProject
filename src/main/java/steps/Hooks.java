package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

public class Hooks extends CommonMethods {

    @Before
    public void start() throws IOException {
        openBrowserAndLaunchApplication();
    }

    @After
    public void end (){
        //   closeBrowser();
    }


}
