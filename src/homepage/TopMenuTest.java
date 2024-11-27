package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;


public class TopMenuTest extends Utility {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    //1.1 create a method with the name "selectMenu()" It has one parameter name "menu"
    //of type string

    public void selectMenu(String menu){
        System.out.println("clicking on menu:"+menu);

    }

    @Test
    //1.3. create the @Test method name verifyPageNavigation(). Use the selectMenu()
    //method to select the Menu and click on it and verify the page navigation.
    public void verifyPageNavigation(){
        String menuName = "COMPUTERS";
        System.out.println("verifying navigate to:"+menuName);


    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
