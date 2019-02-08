package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CapScreenSht {
    public void capScrSht(WebDriver driver, String Abc){

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source,new File("C:\\Users\\srini\\IdeaProjects\\FBLogin\\src\\test\\java\\Screenshots"+Abc+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
