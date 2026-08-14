package com.framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String name) {

        String folderPath = "screenshots";

        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String filePath = folderPath + "/" + name + "_" +
                System.currentTimeMillis() + ".png";

        File source = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(
                    source.toPath(),
                    new File(filePath).toPath(),
                    StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;
    }
}