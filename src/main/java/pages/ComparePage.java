package pages;

import com.codeborne.selenide.Condition;
import common.BaseLibrary;
import common.TestData;
import io.qameta.allure.Step;

public class ComparePage extends BaseLibrary
{


    TestData testData = new TestData();


    @Step("Select first product from bucket")
    public ComparePage price()  {
        testData.BTN_ADDTOCART1.click();
        return this;
    }


    @Step("Select first product from bucket")
    public ComparePage firstProduct()  {
        testData.BTN_ADDTOCART1.click();
        return this;
    }


    @Step("Select second product from bucket")
    public ComparePage secondProduct()  {
        testData.BTN_ADDTOCART2.click();
        return this;
    }

    @Step("Select third product from bucket")
    public ComparePage thirdProduct()  {
        testData.BTN_ADDTOCART3.click();
        return this;
    }

}
