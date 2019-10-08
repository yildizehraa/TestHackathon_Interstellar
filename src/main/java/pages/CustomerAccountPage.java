package pages;

import common.BaseLibrary;
import common.BaseTest;
import common.TestData;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class CustomerAccountPage extends BaseLibrary
{

    TestData testData = new TestData();
    String psw = createRandomText(4)+ createRandomNumber(4) + ".";
    String password="";

    @Step("Create account button click")
    public CustomerAccountPage openCreateAccount(){
        testData.BTN_CREATEACCOUNT.click();
        return this;
    }
    @Step("Fill first name")
    public CustomerAccountPage firstName(){
        testData.TXT_FIRSTNAME.sendKeys("TEST");
        return this;
    }

    @Step("Fill last name")
    public CustomerAccountPage lastName(){
        testData.TXT_LASTNAME.sendKeys("HACKATHON");
        return this;
    }

    @Step("Fill e-mail")
    public CustomerAccountPage eMail(){
        testData.TXT_EMAIL.sendKeys("zehraayildiz@gmail.com");
        return this;
    }

    @Step("Fill password")
    public CustomerAccountPage passWord(){
        testData.TXT_PASSWORD.sendKeys(psw);
        password=psw;
        return this;
    }
    @Step("Confirm password")
    public CustomerAccountPage confirmPassword(){
        testData.TXT_CONFIRMPASSWORD.sendKeys(psw);
        return this;
    }

    @Step("Create an account")
    public CustomerAccountPage submitAccount(){
        testData.BTN_CREATEACCOUNT_SUBMIT.click();
        takeScreenshot();
        return this;
    }

    @Step("Is account created ? ")
    public CustomerAccountPage isCreateSuccess(){
        Assert.assertEquals(testData.BTN_CONFIRMACCOUNT.isDisplayed(),true, "Account is created ! ");
        takeScreenshot();
        return this;
    }

    @Step("Click on sign-in ")
    public CustomerAccountPage openSignIn(){
        testData.BTN_SIGNIN.click();
        return this;
    }

    @Step("Fill e-mail")
    public CustomerAccountPage signInEmail(){
        testData.TXT_SIGNIN_EMAIL.sendKeys("merve.ulug@consultant.turkcell.com.tr");
        return this;
    }

    @Step("Fill password")
    public CustomerAccountPage signInPassword(){
//        testData.TXT_SIGNIN_PASSWORD.sendKeys(password);
                testData.TXT_SIGNIN_PASSWORD.sendKeys("123456789test.");
        return this;
    }

    @Step("Click on sign-in button")
    public CustomerAccountPage signInClick(){
        testData.BTN_SIGNIN_SUBMIT.click();
        return this;
    }

    @Step("Is sign-in success? ")
    public CustomerAccountPage isSignInSuccess(){
        Assert.assertEquals(testData.LBL_COMFIRMSIGNIN.isDisplayed(),true, "Sign-in is successful ! ");
        takeScreenshot();
        return this;
    }
}
