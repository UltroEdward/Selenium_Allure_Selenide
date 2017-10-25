package ru.dasreda.qa.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.dasreda.qa.application.steps.CoursesStep;
import ru.dasreda.qa.framework.utils.SeleniumUtils;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Horseman on 25.10.2017.
 */

@Feature("Courses")
public class CourcesTest {

    @BeforeClass
    private void setUp() {
        Configuration.baseUrl = "http://onliner.by";
        Configuration.browser = "chrome";
    }

    @Test(description = "Human-readable test name")
    public void test1() {
        open("");
        new CoursesStep().addCourse();
        SeleniumUtils.takeScreenShot();
    }

}



