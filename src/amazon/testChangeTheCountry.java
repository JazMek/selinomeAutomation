package amazon;

import org.openqa.selenium.By;

public class testChangeTheCountry extends homePage {


//    Test case 06 : Change the language.

    public static void changeLangue() throws InterruptedException {
        Thread.sleep(1000);

//        Go to the flag and click in.
     driver.findElement(By.cssSelector("#icp-nav-flyout > span > span.nav-line-1 > span")).click();

//  Wait 1000ms.
        Thread.sleep(1000);

     driver.findElement(By.cssSelector("#customer-preferences > div > div > form > div.a-row > div.a-column.a-span7 > div:nth-child(8) > div > label > i")).click();

        Thread.sleep(1000);

     driver.findElement(By.className("a-button-input")).click();

    }
//    Test case 07 : Find more solutions.


    public static void findMoreSolutions() throws InterruptedException {


        driver.findElement(By.className("icp-nav-flag icp-nav-flag-us")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#icp-sl-t-text > a:nth-child(2)")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#a-autoid-0 > span > input")).click();
        Thread.sleep(1000);


    }

//    Test case 08 : change the country .


}