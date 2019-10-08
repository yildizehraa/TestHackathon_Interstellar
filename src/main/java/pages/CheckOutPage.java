package pages;

import com.codeborne.selenide.Condition;
import common.BaseLibrary;
import common.TestData;
import io.qameta.allure.Step;

public class CheckOutPage extends BaseLibrary {


    TestData testData = new TestData();


    @Step("Go to Bucket")
    public CheckOutPage bucket()  {
        testData.BTN_BUCKET.waitUntil(Condition.visible,5000);
       testData.BTN_BUCKET.click();
        return this;
    }

    @Step("Checkout")
    public CheckOutPage gotoCheckOut()  {
//        testData.BTN_PROCEEDTOCHECKOUT.waitUntil(Condition.visible,5000);
        testData.BTN_PROCEEDTOCHECKOUT.click();
        return this;
    }

    @Step("Select Method")
    public CheckOutPage  shippingMethod()  {
        testData.BTN_SHIPPINGMETHOD.scrollTo();
        testData.BTN_SHIPPINGMETHOD.waitUntil(Condition.visible,5000);
        testData.BTN_SHIPPINGMETHOD.click();
        return this;
    }


    @Step("Next payment page")
    public CheckOutPage  nextPaymentPage()  {
        testData.BTN_NEXT.waitUntil(Condition.visible,5000);
        testData.BTN_NEXT.click();
        return this;
    }
    @Step("Check Address")
    public CheckOutPage  checkAddress()  {
        testData.CHK_SHIPPING.waitUntil(Condition.visible,5000);
        testData.CHK_SHIPPING.click();
        return this;
    }

    @Step("New Address")
    public CheckOutPage  newAddress()  {
        testData.CMB_BOX_ADRESS.click();
        testData.CMB_BOX_NEWADRESS.click();
        return this;
    }

    @Step("Add New Address")
    public CheckOutPage  addnewAddress()  {
//        testData.TXT_COMPANY.sendKeys("ınterstellar");
        testData.TXT_STREETADRESS.sendKeys("ınterstellar");
        testData.TXT_CITY.sendKeys("test");
        testData.TXT_STATE.click(); ///enson
        testData.TXT_POSTALCODE.sendKeys("test");
        testData.TXT_TELEPHONE.sendKeys("test");
        testData.BTN_UPDATE.click();



        return this;
    }





}
