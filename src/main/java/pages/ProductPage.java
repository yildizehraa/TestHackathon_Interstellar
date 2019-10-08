package pages;

import com.codeborne.selenide.Condition;
import common.BaseLibrary;
import common.TestData;
import io.qameta.allure.Step;
import org.testng.Assert;

public class ProductPage extends BaseLibrary {


    TestData testData = new TestData();


    @Step("Select price")
    public ProductPage price() throws InterruptedException {
        testData.BTN_MINPRICE.waitUntil(Condition.disappear,5000);
        if(!(testData.BTN_MINPRICE.isDisplayed()))
            testData.BTN_PRICE.click();
        return this;
    }


    @Step("Select min price")
    public ProductPage minPrice(){
        testData.BTN_MINPRICE.click();
        return this;
    }

    @Step("Select min price")
    public ProductPage middlePrice(){
        testData.BTN_MIDPRICE.click();
        return this;
    }

    @Step("Select max price")
    public ProductPage maxPrice(){
        testData.BTN_MAXPRICE.click();
        return this;
    }


    @Step("Select first product")
    public ProductPage firstProduct(){
        testData.BTN_SELECTPRODUCT.click();
        return this;
    }

    @Step("Add to Wishlist")
    public ProductPage addToWishlist(){
        testData.BTN_ADDTOWISHLIST.click();
        wishListMessage();
        return this;
    }

    @Step("Add to compare")
    public ProductPage addToCompare(){
        testData.BTN_SIZE_S.waitUntil(Condition.visible,10000);
        testData.BTN_ADDTOCOMPARE.click();
        return this;
    }

    @Step("Add to compare")
    public ProductPage addToCompareforBottom(){
        testData.BTN_COLOR.waitUntil(Condition.visible,10000);
        testData.BTN_ADDTOCOMPARE.click();
        return this;
    }


    @Step("Add to comparision successful!")
    public ProductPage compareListMessage(){
        testData.TXT_ADDTOCOMPAREMESSAGE.waitUntil(Condition.visible,5000);
        testData.BTN_SIZE_S.waitUntil(Condition.visible,10000);
        String message=testData.TXT_ADDTOCOMPAREMESSAGE.getText();
        if(message.equalsIgnoreCase("You added product"))
            Assert.assertEquals(testData.TXT_ADDTOCOMPAREMESSAGE.isDisplayed(),true, "Add to comparision successful! ");

        //You added product Ariel Roll Sleeve Sweatshirt to the comparison list.
        //You added product Diva Gym Tee to the comparison list.

        takeScreenshot();
        return this;
    }

    @Step("Add to comparision successful!")
    public ProductPage compareListMessageforBottom(){
        testData.TXT_ADDTOCOMPAREMESSAGE.waitUntil(Condition.visible,5000);
        testData.BTN_COLOR.waitUntil(Condition.visible,10000);
        String message=testData.TXT_ADDTOCOMPAREMESSAGE.getText();
        if(message.equalsIgnoreCase("You added product Ariel Roll Sleeve Sweatshirt to the comparison list."))
            Assert.assertEquals(testData.TXT_ADDTOCOMPAREMESSAGE.isDisplayed(),true, "Add to comparision successful! ");
        takeScreenshot();
        return this;
    }

    @Step("Add to wish list successful! ")
    public ProductPage wishListMessage(){
        testData.LBL_MYWISHLIST.waitUntil(Condition.visible,5000);

        if(testData.LBL_MYWISHLIST.isDisplayed())
            Assert.assertEquals(testData.LBL_MYWISHLIST.isDisplayed(),true, "Add to wish list successful! ");
        takeScreenshot();
        return this;
    }


    @Step("Go to compare list page")
    public ProductPage gotoCompareList(){
        testData.BTN_COMPARISONLIST.click();
        takeScreenshot();
        return this;
    }


    @Step("Select size S")
    public ProductPage selectSize(){
        testData.BTN_SIZE_S.waitUntil(Condition.visible,5000).click();
        return this;
    }

    @
            Step("Select size S")
    public ProductPage selectSizeforPants(){
        testData.BTN_SORTSIZE.waitUntil(Condition.visible,5000).click();
        return this;
    }
    @Step("Select colour")
    public ProductPage selectColor(){
        testData.BTN_COLOR.waitUntil(Condition.visible,5000).click();
        return this;
    }


    @Step("Add product to card")
    public ProductPage addtoCard(){
        testData.BTN_ADDTOCART.waitUntil(Condition.visible,5000).click();
        return this;
    }



}
