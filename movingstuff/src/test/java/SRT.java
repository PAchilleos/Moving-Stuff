import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SRT {
    @FindBy(xpath="//*[@id=\"ui-id-3\"]")
    WebElement sel;

    @FindBy(css="#sortable_grid > li:nth-child(12)")
    WebElement s;

    @FindBy(css="#sortable_grid > li:nth-child(1)")
    WebElement e;

    public void c(){
        sel.click();
    }

    public void d(WebDriver w){
        Actions a = new Actions(w);
        Action b = a.moveToElement(s).clickAndHold().moveToElement(e).release().build();
        b.perform();

    }



}


