package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElementHelper {

    public  void clickSmartPhone() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement target = BasePage.driver.findElement(By.linkText("Cihazlar"));
        BasePage.Action(target);
        TimeUnit.SECONDS.sleep(2);
        BasePage.driver.findElement(By.linkText("Akıllı Telefonlar")).click();
    }

    public  void selectDevice() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        try {
            List<WebElement> elements = BasePage.driver.findElements(By.xpath("//div[@id='all-devices-section']/div"));
            for (int i = 3; i < elements.size(); i++) {
                elements = BasePage.driver.findElements(By.xpath("//div[@id='all-devices-section']/div"));
                elements.get(i).click();
                TimeUnit.SECONDS.sleep(2);
                if (BasePage.driver.findElement(By.xpath("//button[contains(.,'Sepete Ekle')]")).getText().equals("Sepete Ekle")) {
                    break;
                }
                BasePage.driver.navigate().back();
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void clickAddBasket() {
        BasePage.driver.findElement(By.cssSelector(".price-radio-cash > .a-price-radio-b__label")).click();
        BasePage.driver.findElement(By.xpath("//button[contains(.,'Sepete Ekle')]")).click();
        }

    public void clickContinueWithoutLogin() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        BasePage.driver.findElement(By.id("none-login-sale-button")).click();
    }

    public void clickUserAgreement() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        BasePage.driver.findElement(By.cssSelector(".m-basket-summary__body label span")).click();
        TimeUnit.SECONDS.sleep(3);
        BasePage.driver.findElement(By.xpath("//a[contains(text(),'Onayla')]")).click();
    }

    public void clickContinueOrder() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        BasePage.driver.findElement(By.xpath("//button[contains(.,'Siparişe Devam Et')]")).click();
    }

    public void writingDeliveryInformation() {
        BasePage.driver.findElement(By.id("fullName")).sendKeys("test test");
        BasePage.driver.findElement(By.id("gsm-1")).sendKeys("05301121212");
        BasePage.driver.findElement(By.id("email")).sendKeys("testtest@gmail.com");
        BasePage.driver.findElement(By.id("tckimlik")).sendKeys("11111111110");
        BasePage.driver.findElement(By.id("customerDeliveryAddressName")).sendKeys("test test");
        BasePage.driver.findElement(By.id("customerDeliveryGsm")).sendKeys("05301121212");
        BasePage.driver.findElement(By.id("select2-select-cities-container")).click();
        BasePage.driver.findElement(By.id("textarea-01")).sendKeys("test amaçlı yazılmaktadır.");
    }

    public void writingPaymentInformation() throws InterruptedException {
        BasePage.driver.findElement(By.id("ccCardHolderName")).sendKeys("test test");
        BasePage.driver.findElement(By.id("ccCardNumber")).sendKeys("5890040000000016");
        BasePage.driver.findElement(By.id("select2-ccMonth-container")).click();
        BasePage.driver.findElement(By.cssSelector("ul#select2-ccMonth-results > li:nth-of-type(3)")).click();
        BasePage.driver.findElement(By.id("select2-ccYear-container")).click();
        BasePage.driver.findElement(By.cssSelector("ul#select2-ccYear-results > li:nth-of-type(3)")).click();
        BasePage.driver.findElement(By.id("ccSecurityNumber")).sendKeys("000");

    }

    public void clickPreliminaryInformationForm() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
       WebElement target;
        target = BasePage.driver.findElement(By.xpath("//form[@id='order-summary-Form']/div/div[2]/div/div[2]/label/span"));
        target.click();
       boolean aa = target.isSelected();
        target.click();
    }

    public void clickPayment() {
        BasePage.driver.findElement(By.xpath("//button[contains(.,'Ödeme Yap')]")).click();
    }
}
