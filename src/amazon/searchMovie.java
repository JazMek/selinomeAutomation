package amazon;

import org.openqa.selenium.By;

public class searchMovie extends homePage {

//    Test case 11: search   a movie and add it to the cart
    public static void searchAndAdd() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(4) > div:nth-child(4) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncated")).click();
        Thread.sleep(1000);

        driver.getTitle();

        System.out.println(driver.getTitle());

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
    }
//    Test case 12:search in the search box and and go bac one step.

    public static void goBackOneStep() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#searchDropdownBox")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#searchDropdownBox > option:nth-child(10)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

    }
    //    Test case 13:search a movie  in the search box.
    public static void searchMovie() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(
                "Star Wars: A New Hope");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);

    }

    //    Test case 15:search a movie :Star Wars: A New Hope in the search box and add it in to the cart.
    public static void movieStarWars() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(
                "Star Wars: A New Hope");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        driver.findElement(By.cssSelector("#nav-cart > span.nav-cart-icon.nav-sprite")).click();
        Thread.sleep(2000);

    }

}
