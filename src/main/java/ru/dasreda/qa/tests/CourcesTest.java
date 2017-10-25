package ru.dasreda.qa.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.dasreda.qa.application.steps.CoursesStep;
import ru.dasreda.qa.framework.baseitems.BaseTest;
import ru.dasreda.qa.framework.utils.SeleniumUtils;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Horseman on 25.10.2017.
 */

@Feature("Courses")
public class CourcesTest extends BaseTest {

    @BeforeClass
    private void setUp() {
        Configuration.baseUrl = "http://onliner.by";
        Configuration.browser = "chrome";
    }

    @Test(description = "Positive test")
    public void test1() {
        open("");
        new CoursesStep().addCourse();
        SeleniumUtils.takeScreenShot();
    }

    @Test(description = "Negative test")
    public void test2() {
        open("");
        assertThat(false).isTrue();
    }

}



