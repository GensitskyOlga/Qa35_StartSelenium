import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;
    @Test

    public void goToPhoneBook() {
        //open driver
        wd=new ChromeDriver();
        // go to phonebook
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/");without history
wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/"); // with history
  wd.navigate().back();
  wd.navigate().forward();
  wd.navigate().refresh();
  //close browser
       wd.close();// close tab
       // wd.quit(); // close browser
    }
    @Test
    public void LoginTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        WebElement element= wd.findElement(By.tagName("h1")); //[phonebook] perviy h1
        element.click();
       List<WebElement> list = wd.findElements(By.tagName("h1")); // vse elementy h1
        WebElement element1 = list.get(1); // Home Component
        element1.click();
        // by id
        wd.findElement(By.id("root"));
        // by class
        wd.findElement(By.className("container"));
        // by link Text
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB")); // chasti texta
        // By name
        wd.findElement(By.name("name"));
        // by css Selector

        wd.findElement(By.cssSelector("h1"));
        // by id
       wd.findElement(By.cssSelector("#root"));
       // by class
        wd.findElement(By.cssSelector(".container"));
        // by attribute
        wd.findElement(By.cssSelector("[href='/home']"));


        // by xPath
        wd.quit();

    }
    @Test
    public void HW1() {
        wd=new ChromeDriver();
        wd.navigate().to("file:///C:/Users/olga/Downloads/index.html");
       WebElement item1= wd.findElement(By.cssSelector("a[href='#item1']"));
        WebElement item2= wd.findElement(By.cssSelector("a[href='#item2']"));
        WebElement item3=wd.findElement(By.cssSelector("a[href='#item3']"));
        WebElement item4= wd.findElement(By.cssSelector("a[href='#item4']"));
        wd.findElement(By.partialLinkText("tem"));
        wd.findElement(By.className("nav-item"));
        List<WebElement> list = wd.findElements(By.className("nav-item"));
        WebElement element1 = list.get(1);
        WebElement element2= list.get(2);
        element1.click();
        wd.findElement(By.name("name"));
        wd.findElement(By.name("surename"));
        WebElement name= wd.findElement(By.cssSelector("input"));
        WebElement surename= wd.findElement(By.cssSelector("input"));
        wd.findElement(By.className("btn"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.cssSelector("td"));
        //wd.findElement(By.cssSelector(""));
        //wd.quit();



    }



}
