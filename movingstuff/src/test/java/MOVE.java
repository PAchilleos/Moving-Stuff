import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class MOVE {
    private WebDriver wd;
    @FindBy(id= "draggableview")
    WebElement draggy;

    @FindBy(id ="droppableview")
    private WebElement target;

    @Before
    public void before() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        wd = new ChromeDriver(options);


    }

    @Test
    public void test1(){


        Drag d = PageFactory.initElements(wd,Drag.class);
        ScreenShot S = new ScreenShot() ;
        FW fl = new FW();
        fl.wt(wd,30,5);
        wd.navigate().to("http://demoqa.com/");
        fl.xpathcon(wd,"//*[@id=\"menu-item-141\"]/a");
        wd.findElement(By.xpath("//*[@id=\"menu-item-141\"]/a")).click();
        fl.xpathcon(wd,"//*[@id=\"draggableview\"]/p");
        fl.xpathcon(wd,"//*[@id=\"droppableview\"]");

        d.drg(wd);



    }

    @Test
    public void test2(){
        int i=0;


        SRT s = PageFactory.initElements(wd,SRT.class);
        ScreenShot S = new ScreenShot() ;
        FW fl = new FW();
        fl.wt(wd,30,5);
        wd.navigate().to("http://demoqa.com/");
        fl.xpathcon(wd,"//*[@id=\"menu-item-151\"]/a");
        wd.findElement(By.xpath("//*[@id=\"menu-item-151\"]/a")).click();
        fl.xpathcon(wd,"//*[@id=\"ui-id-3\"]");
        s.c();
        fl.csscon(wd,"#sortable_grid > li:nth-child(12)");
        fl.csscon(wd,"#sortable_grid > li:nth-child(1)");

        while (i<12) {

            s.d(wd);
            i++;
        }







    }
    @Test
    public void test3(){
        int i =0;


        SLDER slide = PageFactory.initElements(wd,SLDER.class);
        ScreenShot S = new ScreenShot() ;
        FW fl = new FW();
        fl.wt(wd,30,5);
        wd.navigate().to("http://demoqa.com/");
        fl.xpathcon(wd,"//*[@id=\"menu-item-97\"]/a");
        wd.findElement(By.xpath("//*[@id=\"menu-item-97\"]/a")).click();


        while (i<20) {
            fl.csscon(wd,"#slider-range-max > span");

            slide.slide_it(wd);
            i++;

        }

    }

    @Test
    public void test4() {
        int i =0;



        Drag d = PageFactory.initElements(wd, Drag.class);
        ScreenShot S = new ScreenShot();
        Actions a = new Actions(wd);
        FW fl = new FW();
        fl.wt(wd, 30, 5);
        wd.navigate().to("http://demoqa.com/");
        fl.xpathcon(wd, "//*[@id=\"menu-item-140\"]/a");
        wd.findElement(By.xpath("//*[@id=\"menu-item-140\"]/a")).click();
        fl.xpathcon(wd, "//*[@id=\"ui-id-4\"]");
        wd.findElement(By.xpath("//*[@id=\"ui-id-4\"]")).click();
        fl.xpathcon(wd, "//*[@id=\"dragevent\"]/p");





        while (i < 1000) {
           d.fn(a);
           i++;//
        }
        a.release().perform();

        //System.out.println(wd.findElement(By.xpath("//*[@id=\"tabs-1\"]/div")).getLocation().getY());
    }

    @Test
    public void test5() {
        int i =0;



        PNT p = PageFactory.initElements(wd, PNT.class);
        ScreenShot S = new ScreenShot();
        Actions a = new Actions(wd);
        FW fl = new FW();
        fl.wt(wd, 30, 5);
        wd.navigate().to("https://galactic.ink/sketchpad/");
        fl.xpathcon(wd, "//*[@id=\"tools\"]/div/div[5]/div/div[1]/div[7]");
        p.brsh(a);

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.sld(a);
        fl.xpathcon(wd, "//*[@id=\"ctx_marquee\"]");

        p.crtin(a);

       while (i<750){
            int x= ThreadLocalRandom.current().nextInt(-300, 300+1);
            int y = ThreadLocalRandom.current().nextInt(-200, 200+1);
            p.crt(a,x,y);
            i++;
        }
        a.release().build().perform();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }








    }


    @After
    public void after(){
        wd.quit();
    }

}
