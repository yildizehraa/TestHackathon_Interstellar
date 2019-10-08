package pages;

import com.codeborne.selenide.*;
import common.BaseLibrary;
import common.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.format.TextStyle;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
public class HomePage extends BaseLibrary {

    TestData testData = new TestData();


    @Step("Click on women")
    public HomePage womenProducts(){
        testData.BTN_WOMEN.click();
        return this;
    }

    @Step("Click on hoodies sweatshirt")
    public HomePage minFirstProduct(){
        testData.BTN_HOODIESSWEATSHIRTS.click();
        return this;
    }

    @Step("Click on tees")
    public HomePage secondProduct(){
        testData.BTN_TEES.click();
        return this;
    }

    @Step("Click on pants")
    public HomePage thirdProduct(){
        testData.BTN_PANTS.click();
        return this;
    }

    @Step("Select product")
    public HomePage selectProduct(){
        Random r = new Random();
        int number=r.nextInt(5);
        String pathRamdomProduct ="//div[@class='categories-menu']//ul[@class='items']"+"//li["+number+"]";
        SelenideElement BTN_PRODUCT = $(By.xpath(pathRamdomProduct));
        BTN_PRODUCT.click();
        return this;
    }

    @Step("Select compare")
    public HomePage selectCompare(){
        testData.BTN_COMPARELIST.click();
        return this;
    }

    @Step("Go to compare list")
    public HomePage gotoProfile(){
        testData.DENEME.waitUntil(Condition.visible,5000).click();
        return this;
    }



}
