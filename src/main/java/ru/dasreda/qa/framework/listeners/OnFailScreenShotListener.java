package ru.dasreda.qa.framework.listeners;

import io.qameta.allure.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.dasreda.qa.framework.utils.SeleniumUtils;


/**
 * Created by Horseman on 25.10.2017.
 */
public class OnFailScreenShotListener extends TestListenerAdapter {

    private Logger log = LoggerFactory.getLogger(OnFailScreenShotListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Test class started: " + result.getTestClass().getName());
        log.info("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test SUCCESS: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        SeleniumUtils.takeScreenShot();
        log.info("Test FAILED: " + result.getName());
        if (result.getThrowable()!=null) {
            result.getThrowable().printStackTrace();
        }
    }

}
