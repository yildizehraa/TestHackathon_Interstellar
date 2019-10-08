package common;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class TestData extends BaseLibrary
{

    public SelenideElement BTN_CREATEACCOUNT = $(By.xpath("(//a[text()='Create an Account'])[1]"));
    public SelenideElement TXT_FIRSTNAME = $(By.xpath("//input[@id='firstname']"));
    public SelenideElement TXT_LASTNAME = $(By.xpath("//input[@id='lastname']"));
    public SelenideElement TXT_EMAIL = $(By.xpath("//input[@id='email_address']"));
    public SelenideElement TXT_PASSWORD = $(By.xpath("//input[@id='password']"));
    public SelenideElement TXT_CONFIRMPASSWORD = $(By.xpath("//input[@id='password-confirmation']"));
    public SelenideElement BTN_CREATEACCOUNT_SUBMIT = $(By.xpath("//button[@class='action submit primary']"));
    public SelenideElement BTN_CONFIRMACCOUNT = $(By.xpath("//span[text()='My Account']"));

    public SelenideElement BTN_SIGNIN = $(By.xpath("(//ul[@class='header links']//li[2]//a[1])[1]"));
    public  SelenideElement TXT_SIGNIN_EMAIL = $(By.xpath("//input[@id='email']"));
    public SelenideElement TXT_SIGNIN_PASSWORD = $(By.xpath(" //input[@name='login[password]']"));
    public SelenideElement BTN_SIGNIN_SUBMIT = $(By.xpath("(//button[@name='send'])[1]"));
    public SelenideElement LBL_COMFIRMSIGNIN = $(By.xpath("(//span[@class='logged-in'])[1]"));


}
