package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();

        return driver; 
    }


}
