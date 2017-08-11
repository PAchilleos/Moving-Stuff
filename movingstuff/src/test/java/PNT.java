
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class PNT {

    @FindBy(xpath = "//*[@id=\"tools\"]/div/div[5]/div/div[1]/div[7]")
    WebElement brush;

    @FindBy(xpath = "//*[@id=\"diameter_brushCur\"]")
    WebElement sldr;

    @FindBy(xpath = "//*[@id=\"ctx_marquee\"]")
    WebElement canv;

    public void brsh(Actions a){
        a.moveToElement(brush).click().build().perform();
        //brush.click();
    }

    public void sld(Actions a){
        Action b = a.moveToElement(sldr).clickAndHold().moveByOffset(-26,0).release().build();
        b.perform();
    }

    public void crtin(Actions a){
        a.moveToElement(canv).clickAndHold().build().perform();

    }

    public void crt(Actions a,int x,int y){
        //int x= ThreadLocalRandom.current().nextInt(-5, 5+1);
        //int y = ThreadLocalRandom.current().nextInt(-5, 5+1);
        //Action b = a.moveByOffset(x,y).build();
        //b.perform();

        a.moveByOffset(x,0).build().perform();
        a.moveByOffset(0,y).build().perform();
        a.moveByOffset(-1*x,0).build().perform();
        a.moveByOffset(0,-1*y).build().perform();




    }
}
