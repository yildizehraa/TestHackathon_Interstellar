package tests.Luma;

import common.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.sleep;


@Feature("Test")
public class Luma extends BaseTest {


    HomePage mainPage=new HomePage();



    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS0001 : Test")
    public void TS0001_Test(){

        mainPage.open();
        sleep(5000);
        takeScreenshot();

    }

}

