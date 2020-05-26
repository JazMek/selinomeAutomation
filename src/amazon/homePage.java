package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class homePage {

    public static WebDriver driver=new ChromeDriver();
    public static String cromeDriver="webdriver.chrome.driver";
    public static String chromeDriverPath="BrowserDriver/mac/chromedriver";
    public static String addurl="https://www.amazon.com/";







        public static void setUpDriver(String broserDriver,String broserDriverPath,String url){

          System.setProperty(broserDriver,broserDriverPath);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.get(url);
        }

            public static void main(String[] args) throws InterruptedException {


//      call the setUpDriver method .
                setUpDriver(cromeDriver,chromeDriverPath,addurl);

//      add a waiting time like this we can fallow the changes in tne browser.
//                waitTime();




//******************************** Test Login Fonction *****************************************************************

//  Test case 01 create an Amazon account.
//            testLoginFonction.creatAcount();

//  Test case 02 Login to Amazon account.
//            testLoginFonction.loginToAmazon();

//  Test case 03  Forgot Password.
//              testLoginFonction.forgotPassWord();

//  Test case 04 Other Issues With Sign In.
//              testLoginFonction.OtherIssuesWithSignIn();

//  Tes case  05 Login from the Hamburger Menu.
//              testLoginFonction.loginHamburgerMenu();

//***********************************************************************************************************************


//    Test case 06 : Change the language.
//              testChangeTheCountry.changeLangue();
//    Test case 07 : Find more solutions.
//              testChangeTheCountry.findMoreSolutions();
//  Test case 08  Forgot Password.
//              testLoginFonction.forgotPassWord();

//  Test case 09 Other Issues With Sign In.
//              testLoginFonction.OtherIssuesWithSignIn();


//***********************************************************************************************************************

//    Test case 11: search   a movie and add it to the cart.
//             searchMovie.searchAndAdd();
//    Test case 12:search in the search box and and go bac one step
//              searchMovie.goBackOneStep();
//    Test case 13:search a movie  in the search box.
//                searchMovie.searchMovie();
//    Test case 14: search   a movie and add it to the cart and go bac to the home page.
//             searchMovie.searchAndAdd();
//    Test case 15:search a movie :Star Wars: A New Hope in the search box and add it in to the cart.
//                searchMovie.movieStarWars();
//**********************************************************************************************************************
//   Test case 21:Sell on Amazon
//                makeMoneyWithUs.SellOnAmazon();
//   Test case 22:Sell Under Amazon Accelerator
//                makeMoneyWithUs.SellUnderAmazonAccelerator();
//   Test case 23:Sell on Amazon Handmade
//                makeMoneyWithUs.AmazonHandmade();
//   Test case 24:Sell Your Services on Amazon
//                makeMoneyWithUs.ServicesOnAmazon();
//    Test case 25:Sell on Amazon Business
//                  makeMoneyWithUs.AmazonBusiness();
//    Test case 26:Sell Your Apps on Amazon
//                     makeMoneyWithUs.SellYourApps();
//    Test case 27:Become an Affiliate
//                        makeMoneyWithUs.Affiliate();
//    Test case 28:Advertise Your Products
//                      makeMoneyWithUs.Advertise();
//    Test case 29:Self-Publish with Us
//                      makeMoneyWithUs.SelfPublish();
//    Test case 30:›See More
//                        makeMoneyWithUs.SeeMore();
//**********************************************************************************************************************
//       call the closing window method to close the window in the end.
               closeRunningWindow();

//                quitAllOpenWindows();


            }


//-----------------------------------------------------------------------------------------------------------------------

              // Test Case: search Hand sanitizer in search box
             // Open Browser and Navigate to URL
            //  Enter Keyword in searchBox

     public static void waitTime() throws InterruptedException {
      // Wait 5 sec
        Thread.sleep(5000);}

     public static void closeRunningWindow(){
        // close the running window only
       driver.close();
        }

     public static void quitAllOpenWindows(){
        // quit all the open windows/ tabs
      driver.quit();}


//--------------------------------------------------------------------------------------------------------
////        // Firefox Browser
////        String firefoxDriver="webdriver.gecko.driver";
////        String firefoxDriverPath="BrowserDriver\\windows\\geckodriver.exe";
////        System.setProperty(firefoxDriver,firefoxDriverPath);
////        WebDriver driver1= new FirefoxDriver();
////        driver1.get("https://www.amazon.com/");





}

