package ru.dasreda.qa.framework.utils;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Created by Horseman on 25.10.2017.
 */
public class SeleniumUtils {

    @Attachment(value = "Page screenshot", type = "image/jpg")
    public static byte[] takeScreenShot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
