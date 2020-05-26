package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLoginFonction extends homePage  {

//Test case 01 :
    public static void creatAcount() throws InterruptedException {


//  Navigate to the sing in position and click in.
        driver.findElement(By.cssSelector("#nav-link-accountList > div > span")).click();

//  Go to "creat your amazon account" and click in .
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();

//  Wait 1000ms.
        Thread.sleep(1000);

//  Go to "your name"  and insert the name "karimmek07".
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("karimmek07");

//  Wait 1000ms .
        Thread.sleep(1000);

//  Go to "Email "  and insert the email "karimmek@gmail.com".
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("karimmek@gmail.com");

//  Wait 1000ms .
        Thread.sleep(1000);

//  Go to "Password "  and insert the password "karim1987".
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("karim1987");

        Thread.sleep(1000);

//  Go to "Re-enter password"  and insert the password "karim1987".
        driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("karim1987");

        Thread.sleep(1000);

//  Go to "create your amazon account" and click in.
        driver.findElement(By.cssSelector("#continue")).click();

        Thread.sleep(1000);

//  Get the title.
        String title = driver.getTitle();

        System.out.println(title);

    }


//    Test case 02:

    public static void loginToAmazon() throws InterruptedException {



//  Navigate to the sing in position and click in.
        driver.findElement(By.cssSelector("#nav-link-accountList > div > span")).click();

//  Wait 2000ms.
        Thread.sleep(2000);

//  Go to "Email "  and insert the email "karimmek@gmail.com".
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("karimmekdoud@yahoo.fr");

//  Wait 2000ms.
        Thread.sleep(2000);

//Go to "continue" and click.
        driver.findElement(By.cssSelector("#continue")).click();

        Thread.sleep(2000);

//  Go to "Password "  and insert the password "karimmek".
//            driver.findElement(By.cssSelector("#ap_password")).sendKeys("karimmek");

        Thread.sleep(2000);

//Go to "Sing in" and click.
        driver.findElement(By.cssSelector("#signInSubmit")).click();

//  Get the title.
        String title = driver.getTitle();

        System.out.println(title);
    }

//  Test case 03: Forgot Password.

    public static void forgotPassWord() throws InterruptedException {


        //  Navigate to the sing in position and click in.
        driver.findElement(By.cssSelector("#nav-link-accountList > div > span")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div.a-section > form > div > div > div > div:nth-child(5) > div > a > i")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#auth-fpp-link-bottom")).click();

        Thread.sleep(2000);
    }
//  Test case 04: Other issues with Sign-In.

    public static void OtherIssuesWithSignIn() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-link-accountList > div > span")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div.a-section > form > div > div > div > div:nth-child(5) > div > a > i")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#ap-other-signin-issues-link")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#cu-select-firstNode")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#cu-select-firstNode > option:nth-child(2)")).click();

        Thread.sleep(2000);
    }

//    Test case 05 Login from the hamburger-menu.
    public static void loginHamburgerMenu() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-customer-name")).click();
        Thread.sleep(2000);

    }
}
