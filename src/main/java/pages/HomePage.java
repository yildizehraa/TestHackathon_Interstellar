package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import common.BaseLibrary;
import common.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
public class HomePage extends BaseLibrary {

    TestData testData = new TestData();


    @Step("Open Flight")
    public HomePage openFlight(){
//        BTN_FLIGHT_XPATH.click();
        return this;
    }



}
