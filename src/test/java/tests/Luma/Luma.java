package tests.Luma;

import common.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.CustomerAccountPage;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.sleep;


@Feature("Test")
public class Luma extends BaseTest {


    HomePage homePage = new HomePage();



    @Severity(SeverityLevel.CRITICAL)
    @Test(enabled = true, description = "TS0001 : Create an Account")
    public void TS0001_CreateAccount(){
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

}

