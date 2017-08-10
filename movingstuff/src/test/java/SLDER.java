import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SLDER {


    @FindBy(css="#slider-range-max > span")
    WebElement sl;

   public void slide_it(WebDriver w){
       int x=ThreadLocalRandom.current().nextInt(-20, 20+1);
       x=x*10;

       Actions a = new Actions(w);
       Action b = a.moveToElement(sl).clickAndHold().moveByOffset(x,0).release().build();

       b.perform();
       try {
           TimeUnit.MILLISECONDS.sleep(500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


   }
}
