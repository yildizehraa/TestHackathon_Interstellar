package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import common.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BaseLibrary {
//    SelenideElement BTN_FLIGHT_XPATH = $(By.xpath("//button[@id='tab-flight-tab-hp']"));


    @Step("Open Url")
    public void open() {
        Configuration.baseUrl = ("http://ec2-52-213-49-102.eu-west-1.compute.amazonaws.com/");
        WebDriverRunner.clearBrowserCache();
        Selenide.open("");
        maximazeBrowser();

    }



}
