package PageModels;

import Helper.WebElementHelper;

import java.util.concurrent.TimeUnit;

public class PageModel {

    protected WebElementHelper webElement = new WebElementHelper();

    public void ClickSmartPhone() throws InterruptedException {
        webElement.clickSmartPhone();
        TimeUnit.SECONDS.sleep(3);
    }

    public void SelectDeviceWithAddBasket() throws InterruptedException {
        webElement.selectDevice();
        TimeUnit.SECONDS.sleep(3);
    }

    public void ClickAddBasket() throws InterruptedException {
        webElement.clickAddBasket();
        TimeUnit.SECONDS.sleep(3);
    }

    public void ClickContinueWithoutLogin() throws InterruptedException {
        webElement.clickContinueWithoutLogin();
    }

    public void ClickUserAgreementContinueOrder() throws InterruptedException {
        webElement.clickUserAgreement();
        webElement.clickContinueOrder();
    }

    public void WritingDeliveryInformation() throws InterruptedException {
        webElement.writingDeliveryInformation();
        webElement.clickContinueOrder();
    }

    public void WritingPaymentInformation() throws InterruptedException {
        webElement.writingPaymentInformation();
        webElement.clickContinueOrder();
    }

    public void ClickPreliminaryInformationForm() throws InterruptedException {
        webElement.clickPreliminaryInformationForm();
        webElement.clickPayment();
    }
}
