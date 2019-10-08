package tests.Luma;

import common.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.sleep;


@Feature("Test")
public class Luma extends BaseTest {


    HomePage homePage = new HomePage();



    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS0001 : Create an Account")
    public void TS001_CreateAccount(){
        CustomerAccountPage customerAccountPage = new CustomerAccountPage();

        open();
       customerAccountPage
               .openCreateAccount()
               .firstName()
               .lastName()
               .eMail()
               .passWord()
               .confirmPassword();
//               .submitAccount()
//               .isCreateSuccess();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS002 : Sign - In")
    public void TS002_SignIn(){
        CustomerAccountPage customerAccountPage = new CustomerAccountPage();

        open();
        customerAccountPage
                .openSignIn()
                .signInEmail()
                .signInPassword()
                .signInClick()
                .isSignInSuccess();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS003 : Make an Order")
    public void TS003_MakeOrder() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CustomerAccountPage customerAccountPage = new CustomerAccountPage();
        open();

        customerAccountPage
                .openSignIn()
                .signInEmail()
                .signInPassword()
                .signInClick()
                .isSignInSuccess();

        homePage
                .womenProducts()
//                .selectProduct();
                .minFirstProduct();
        productPage
                .price()
                .minPrice()
                .firstProduct()
                .addToCompare()
                .compareListMessage();

        homePage
                .womenProducts()
                .secondProduct();
        productPage
                .price()
                .middlePrice()
                .firstProduct()
                .addToCompare()
                .compareListMessage()
                .addToWishlist();

        homePage
                .womenProducts()
                .thirdProduct();
        productPage
                .price()
                .maxPrice()
                .firstProduct()
                .addToCompareforBottom()
                .compareListMessageforBottom();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS004 : Add products to Card")
    public void TS004_AddCart()  {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CustomerAccountPage customerAccountPage = new CustomerAccountPage();
        ComparePage comparePage = new ComparePage();
        CheckOutPage checkOutPage = new CheckOutPage();
        open();

        customerAccountPage
                .openSignIn()
                .signInEmail()
                .signInPassword()
                .signInClick()
                .isSignInSuccess();

    homePage
            .gotoProfile();

        comparePage
                .firstProduct();

        productPage
                .selectSize()
                .selectColor()
                .addtoCard();

        back();

        comparePage
                .secondProduct();

        productPage
                .selectSize()
                .selectColor()
                .addtoCard();

        back();

        comparePage
                .thirdProduct();

        productPage
                .selectSizeforPants()
                .selectColor()
                .addtoCard();

        checkOutPage
                .bucket();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS005 : Payment Process")
    public void TS005_PaymentProcess()  {
        CustomerAccountPage customerAccountPage = new CustomerAccountPage();
        CheckOutPage checkOutPage = new CheckOutPage();
        open();

        customerAccountPage
                .openSignIn()
                .signInEmail()
                .signInPassword()
                .signInClick()
                .isSignInSuccess();

        checkOutPage
                .bucket()
                .gotoCheckOut()
                .shippingMethod()
                .nextPaymentPage()
                .checkAddress()
                .newAddress()
                .addnewAddress();
    }
}

