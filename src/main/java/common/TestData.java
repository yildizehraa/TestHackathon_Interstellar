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


//    public SelenideElement BTN_WOMEN = $(By.id("ui-id-4"));
    public SelenideElement BTN_WOMEN = $(By.xpath("//a[@id='ui-id-4']//span[text()='Women']"));
    public SelenideElement BTN_HOODIESSWEATSHIRTS = $(By.xpath("//a[text()='Hoodies & Sweatshirts']"));
    public SelenideElement BTN_TEES = $(By.xpath("//a[text()='Tees']"));
    public SelenideElement BTN_PANTS = $(By.xpath("//a[text()='Pants']"));

    public SelenideElement BTN_PRICE= $(By.xpath("//div[text()='Price']"));
    public SelenideElement BTN_MINPRICE= $(By.xpath("//div[@id='narrow-by-list']//div[3]//div[2]//li[1]"));
    public SelenideElement BTN_MIDPRICE= $(By.xpath("//div[@id='narrow-by-list']//div[3]//div[2]//li[2]"));
    public SelenideElement BTN_MAXPRICE= $(By.xpath("//div[@id='narrow-by-list']//div[3]//div[2]//li[3]"));

    public SelenideElement BTN_SELECTPRODUCT = $(By.xpath("(//img[@class='product-image-photo'])[1]"));

    public SelenideElement BTN_ADDTOCART = $(By.xpath("//button[@id='product-addtocart-button']"));
    public SelenideElement BTN_ADDTOWISHLIST = $(By.xpath("//div[@class='product-addto-links']//a[1]"));
    public SelenideElement BTN_ADDTOCOMPARE = $(By.xpath("//div[@class='product-addto-links']//a[2]"));

    public SelenideElement TXT_ADDTOCOMPAREMESSAGE = $(By.xpath("(//div[@role='alert']//div[@data-bind])[1]"));
    public SelenideElement LBL_MYWISHLIST = $(By.xpath("//span[text()='My Wish List']"));

    public SelenideElement BTN_SIZE_S = $(By.xpath("(//div[@class='swatch-attribute-options clearfix'])[1]//div[@option-label='S']"));
    public SelenideElement BTN_SIZE_M = $(By.xpath("(//div[@class='swatch-attribute-options clearfix'])[1]//div[@option-label='M']"));
    public SelenideElement BTN_COLOR = $(By.xpath("(//div[@class='swatch-attribute-options clearfix'])[2]//div[1]"));

    public SelenideElement BTN_COMPARISONLIST = $(By.xpath("//a[@href='http://ec2-52-213-49-102.eu-west-1.compute.amazonaws.com/catalog/product_compare/']"));
//    public SelenideElement BTN_ADDTOCART = $(By.xpath("//button[@id='product-addtocart-button']"));

    public SelenideElement BTN_ADDTOCART1 = $(By.xpath("(//td[@data-th='Product']//div[@class='actions-primary'])[1]"));
    public SelenideElement BTN_ADDTOCART2 = $(By.xpath("(//td[@data-th='Product']//div[@class='actions-primary'])[2]"));
    public SelenideElement BTN_ADDTOCART3 = $(By.xpath("(//td[@data-th='Product']//div[@class='actions-primary'])[3]"));
    public SelenideElement BTN_SORTSIZE = $(By.xpath("(//div[@class='swatch-attribute-options clearfix'])[1]//div[1]"));
    public SelenideElement BTN_BUCKET = $(By.xpath("//div[@data-block='minicart']//span[@class='counter qty']"));
    public SelenideElement BTN_PROCEEDTOCHECKOUT= $(By.id("top-cart-btn-checkout"));
    public SelenideElement TXT_PRICE= $(By.xpath("//div[@class='amount price-container']//span[text()='$150.00']"));
    public SelenideElement BTN_COMPARELIST= $(By.xpath("//span[text()='Compare']"));
    public SelenideElement DENEME= $(By.xpath("//li[@class='item link compare']//a"));


    public SelenideElement BTN_SHIPPINGMETHOD = $(By.xpath("(//input[@type='radio'])[2]"));
    public SelenideElement CHK_ADDRESS = $(By.xpath("//button[@class='button action continue primary']"));
    public SelenideElement BTN_NEXT = $(By.xpath("//button[@class='button action continue primary']"));


    public SelenideElement CHK_SHIPPING = $(By.xpath("//input[@id='billing-address-same-as-shipping-checkmo']"));
    public SelenideElement CMB_BOX_ADRESS = $(By.xpath("//select[@name='billing_address_id']"));
    public SelenideElement CMB_BOX_NEWADRESS = $(By.xpath("//select[@name='billing_address_id']//option[text()='New Address']"));
    public SelenideElement TXT_COMPANY = $(By.xpath("(//fieldset[@data-form='billing-new-address']//div[3]//div[@class='control'])[1]"));

    public SelenideElement TXT_CITY = $(By.xpath("(//fieldset[@data-form='billing-new-address']//div[4]//div[@class='control'])[1]"));
    public SelenideElement TXT_STATE = $(By.xpath("(//div[@class='field _required']//div[@class='control']//select[@name='region_id'])[2]"));
    public SelenideElement TXT_STREETADRESS = $(By.xpath("(//div[@class='field _required']//div[@class='control']//input[@name='street[0]'])[2]"));
    public SelenideElement TXT_POSTALCODE = $(By.xpath("(//div[@class='field _required']//div[@class='control']//input[@name='postcode'])[2]"));
    public SelenideElement TXT_CONTRY = $(By.xpath("//div[@class='field _required']//div[@class='control']//select[@id='L04FK99']"));
    public SelenideElement TXT_TELEPHONE = $(By.xpath("(//div[@class='field _required']//div[@class='control _with-tooltip']//input[@name='telephone'])[2]\n"));
    public SelenideElement BTN_UPDATE = $(By.xpath("//button[@class='action action-update']"));

}
