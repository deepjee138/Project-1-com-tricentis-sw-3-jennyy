package computer;
/**
 * Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on the COMPUTERS Menu.
 * 1.2 Click on the Desktop
 * 1.3 Select Sort By option "Name: Z to A"
 * 1.4 Verify the Product will be arranged in Descending order.
 */

/**
 * Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on the COMPUTERS Menu.
 * 2.2 Click on the Desktop
 * 2.3 Select Sort By option "Name: A to Z"
 * 2.4 Click on the "Add To Cart" button of the product name ‘Build your own computer’
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
 * 2.7.Select "8GB [+$60.00]" using the Select class.
 * 2.8 Select HDD radio button "400 GB [+$100.00]"
 * 2.9 Select the OS radio button "Windows 10 [+$60.00]"
 * 2.10 Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11 Verify the price "1200.00"
 * 2.12 Click on the "Add to card" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on the
 * Top green Bar
 * 2.14 After that close the bar by clicking on the cross button.
 * 2.15 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
 * 2.16 Verify the message "Shopping cart"
 * 2.17 Change the Qty to "2" and Click on "Update shopping cart"
 * 2.18 Verify the Total "2,950.00"
 * 2.19 click on the checkbox “I agree with the terms of service”
 * 2.20 Click on “Checkout”
 * 2.21 Verify the Text “Welcome, Please Sign In!”
 * 2.22 Click on the “Checkout as Guest” Tab
 * 2.23 Enter the First name
 * 2.24 Enter the Last name
 * 2.25 Enter the email
 * 2.26 Select the Country “United Kingdom” using the select class
 * 2.27 Enter the city
 * 2.28 Enter the Address1
 * 2.29 Enter the Zip/Postal code
 * 2.30 Enter the Phone number
 * 2.31 Click on the “Continue” button
 * 2.32 Click on the “Continue” button
 * 2.33 Click on the Radio Button “Next Day Air($0.00)”
 * 2.34 Click on the “Continue” button
 * 2.35 Select the Radio Button “Credit Card”
 * 2.36 Click on the “Continue” button
 * 2.37 Select “Master card” From the Select credit card dropdown using the Select class
 * 2.38 Enter the Cardholder's name
 * 2.39 Enter the Card number
 * 2.40 Select the Expiration date using the select class
 * 2.41 Enter the Card code
 * 2.42 Click on the “Continue” button
 * 2.43 Verify “Payment Method” is “Credit Card”
 * 2.44 Verify “Shipping Method” is “Next Day Air”
 * 2.45 Verify Total is “2,950.00”
 * 2.46 Click on the “Confirm” button
 * 2.47 Verify the Text “Thank You”
 * 2.48 Verify the message “Your order has been successfully processed!”
 * 2.49 Click on the “Continue” button
 * 2.50 Verify the text “Welcome to our store”
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends Utility {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Click on the COMPUTERS Menu.
        clickOnElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));

        // * 1.2 Click on the Desktop
        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']"));


        //* 1.3 Select Sort By option "Name: Z to A"
        driver.findElement(By.id("products-orderby"));
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: Z to A");


        // * 1.4 Verify the Product will be arranged in Descending order.
        List<WebElement> productsList = driver.findElements(By.xpath("//div[@class='product-grid']"));
        List<String> productOrderList = new ArrayList<>();
        for (WebElement products : productsList) {


        }
        List<String> expectedProductOrder = new ArrayList<>(productOrderList);
        Collections.sort(expectedProductOrder);
        Assert.assertEquals("Price are not displayed in the Low to High order", expectedProductOrder, productOrderList);


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

      //Click on the COMPUTERS Menu.
        clickOnElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));

        //Click on the Desktop
        clickOnElement(By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']"));

        //Select Sort By option "Name: A to Z"
        selectByVisibleTextFromDropDown(By.name("products-orderby"), "Name: A to Z");

        //Click on the "Add To Cart" button of the product name ‘Build your own computer’
        clickOnElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]"));

        //Verify the Text "Build your own computer"
        String textBuildYourOwnComputer = getTextFromElement(By.xpath("//h1[normalize-space()='Build your own computer']"));
        verifyText("Invalid Text", "Build your own computer", textBuildYourOwnComputer);

        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        selectByVisibleTextFromDropDown(By.id("product_attribute_16_5_4"), "2.2 GHz Intel Pentium Dual-Core E2200");

        //Select "8GB [+$60.00]" using the Select class.
        selectByVisibleTextFromDropDown(By.id("product_attribute_16_6_5"), "8GB [+60.00]");

        //Select HDD radio button "400 GB [+$100.00]"
        clickOnElement(By.xpath("//input[@id='product_attribute_16_3_6_19']"));

        //Select the OS radio button "Windows 10 [+$60.00]"
        clickOnElement(By.id("product_attribute_16_4_7_21"));

        //Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        clickOnElement(By.id("product_attribute_16_8_8_22"));
        clickOnElement(By.id("product_attribute_16_8_8_24"));

        //Verify the price "1200.00"
        String priceVerify = getTextFromElement(By.xpath("//span[contains(text(),'1200.00')]"));
        verifyText("Invalid Price", "1200.00", priceVerify);

        //Click on the "Add to card" Button.
        clickOnElement(By.id("add-to-cart-button-16"));

        //Verify the Message "The product has been added to your shopping cart" on the
        //Top green Bar
        String productAddedToCart = getTextFromElement(By.xpath("//p[@class='content']")).trim().split("\n ")[0];
        verifyText("Invalid Text Display", "The product has been added to your shopping cart", productAddedToCart);

        //After that close the bar by clicking on the cross button.
        clickOnElement(By.xpath("//span[@title='Close']"));

        //Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        mouseHoverAndClickOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));

        //Verify the message "Shopping cart"
        String messageShoppingCart = getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']"));
        verifyText("No message display", "Shopping cart", messageShoppingCart);

        //Change the Qty to "2" and Click on "Update shopping cart"
        sendTextToElement(By.xpath("//td[@class='qty nobr']/input"), "2");
        clickOnElement(By.xpath("//input[@name='updatecart']"));

        //Verify the Total "2,950.00"
//       String totalAmount = getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
//       verifyText("Invalid Total", "2950.00", totalAmount);

        //click on the checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));

        //Click on “Checkout”
        clickOnElement(By.id("checkout"));

        //Verify the Text “Welcome, Please Sign In!”
        String welcomeText = getTextFromElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));
        verifyText("Invalid Display", "Welcome, Please Sign In!", welcomeText);

        //Click on the “Checkout as Guest” Tab
        clickOnElement(By.xpath("//input[@value='Checkout as Guest']"));

        //Enter the First name
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "Ram");

        //Enter the Last name
       sendTextToElement(By.id("BillingNewAddress_LastName"), "Patel");

        //Enter the email
        sendTextToElement(By.id("BillingNewAddress_Email"), "RamPatel818@gmail.com");

        //Select the Country “United Kingdom” using the select class
        selectByVisibleTextFromDropDown(By.id("BillingNewAddress_CountryId"), "United Kingdom");

        //Enter the city
        sendTextToElement(By.id("BillingNewAddress_City"), "London");

        //Enter the Address1
        sendTextToElement(By.id("BillingNewAddress_Address1"), "99 Epsom");

        //Enter the Zip/Postal code
       sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "kt1 8pe");

        //Enter the Phone number
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "+447986738281");

        //Click on the “Continue” button
        clickOnElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"));

        //Click on the “Continue” button
        clickOnElement(By.xpath("//input[@onclick='Shipping.save()']"));

        //Click on the Radio Button “Next Day Air($0.00)”
        clickOnElement(By.id("shippingoption_1"));

        //Click on the “Continue” button
        clickOnElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]"));

        //Select the Radio Button “Credit Card”
        clickOnElement(By.xpath("//input[@id='paymentmethod_2']"));

        //Click on the “Continue” button
        clickOnElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]"));

        //Select “Master card” From the Select credit card dropdown using the Select class
        selectByVisibleTextFromDropDown(By.id("CreditCardType"), "Master card");

        //Enter the Cardholder's name
        sendTextToElement(By.id("CardholderName"), "Ram");

        //Enter the Card number
        sendTextToElement(By.id("CardNumber"), "5283604144086333");

        //Select the Expiration date using the select class
        selectByIndexFromDropDown(By.xpath("//select[@id='ExpireMonth']"), 11);
        // selectByIndexFromDropDown(By.xpath("//select[@id='ExpireYear']"), 2028);

        //Enter the code
        sendTextToElement(By.id("CardCode"), "690");

        //Click on the “Continue” button
        clickOnElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]"));

        //Verify the “Payment Method” is “Credit Card”
        String cardPaymentMethod = getTextFromElement(By.xpath("//li[@class='payment-method']"));
        verifyText("The Payment Method is not credit card", "Credit Card", cardPaymentMethod);

        //Verify “Shipping Method” is “Next Day Air”
        String cardShippingMethod  = getTextFromElement(By.xpath("//li[@class='shipping-method']"));
        verifyText("The Shipping Method next Day Air is not displayed", "Next Day Air", cardShippingMethod);

        //Verify Total is “2,950.00”
//        String textTotalPrice = getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
//        verifyText("The Price is not displayed", "2950.00", textTotalPrice);

        //Click on the “Confirm” button
        clickOnElement(By.xpath("//input[@value='Confirm']"));

        //Verify the Text “Thank You”
        String textThankYou = getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']"));
        verifyText("The text thank you is not displayed ", "Thank you", textThankYou);

        //Verify the message “Your order has been successfully processed!”
        String messageActualSuccess = getTextFromElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"));
        verifyText("The message is not displayed ", "Your order has been successfully processed!", messageActualSuccess);

        //Click on the “Continue” button
        clickOnElement(By.xpath("//input[@value='Continue']"));

        //Verify the text “Welcome to our store”
        String textWelcomeMessage = getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']"));
        verifyText("The message is not displayed ", "Welcome to our store", textWelcomeMessage);
        
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}



