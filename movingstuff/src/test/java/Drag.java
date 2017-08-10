import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Drag {


    @FindBy(xpath = "//*[@id=\"draggableview\"]/p")
    private WebElement draggy;

    @FindBy(xpath ="//*[@id=\"droppableview\"]")
    private WebElement target;


    public void drg(WebDriver w){
        Actions a = new Actions(w);
        Action b = a.moveToElement(draggy).clickAndHold().moveToElement(target).release().build();
        b.perform();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}
