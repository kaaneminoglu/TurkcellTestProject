import Helper.BasePage;
import PageModels.PageModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TurkcellTest {
    PageModel pageModel = new PageModel();

    @BeforeMethod
    public void setupTest (){
        BasePage.SelectDriver("Chrome");
        BasePage.OpenWebSite("https://www.turkcell.com.tr/");
    }

    @Test
    public void firstTest () throws InterruptedException {
        //Header menüden ; Cihazlar > Akıllı Telefonlar kategorisine gidilir.
        pageModel.ClickSmartPhone();

        //Herhangi bir cihaz detaya gidilir. ("Sepete Ekle" butonu gelen cihaz bulunana kadar cihaz detaylar gezilir.)
        pageModel.SelectDeviceWithAddBasket();

        //Peşin fiyat radio butonu seçilerek "Sepete Ekle" butonuna tıklanır.
        pageModel.ClickAddBasket();

        //Headerda açılan giriş alanında "Giriş yapmadan devam et" butonuna tıklanır.
        pageModel.ClickContinueWithoutLogin();

        //"Kullanıcı Sözleşmesi" checkboxı işaretlenerek "Siparişe Devam Et" butonuna tıklanır.
        pageModel.ClickUserAgreementContinueOrder();
        //Teslimat bilgileri ekranındaki tüm zorunlu alanlar random bilgilerle doldurularak "Siparişe Devam Et" butonuna tıklanır.
        pageModel.WritingDeliveryInformation();
        //Ödeme bilgileri ekranında ad/soyad ve kredi kartı bilgileri girilerek "Siparişe Devam Et" butonuna tıklanır.
        pageModel.WritingPaymentInformation();
        //Sipariş özeti ekranında "Ön Bilgilendirme Formu ve Mesafeli Satış Sözleşmesi" checklenerek "Ödeme Yap" butonuna tıklanır.
        pageModel.ClickPreliminaryInformationForm();
    }

        //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        BasePage.QuitDriver();
    }
}
