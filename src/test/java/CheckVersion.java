import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;


//        ChromeOptions options = new ChromeOptions();
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("intl.accept_languages", "de-DE,de");
//        options.setExperimentalOption("prefs", prefs);
//        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        Configuration.holdBrowserOpen = true;


public class CheckVersion {

    String version = "58.24";
    String baseHuaweiStoreLink = "https://appgallery.huawei.ru/#/app/";
    String storeLinkHuaweiPokerist = baseHuaweiStoreLink + "C100359849";
    String storeLinkHuaweiBelote = baseHuaweiStoreLink + "C107757643";
    String storeLinkHuaweiBlackjackist = baseHuaweiStoreLink + "C100360171";
    String storeLinkHuaweiCraps = baseHuaweiStoreLink + "C107697375";
    String storeLinkHuaweiDurak = baseHuaweiStoreLink + "C102419287";
    String storeLinkHuaweiRoulettist = baseHuaweiStoreLink + "C100360179";
    String storeLinkHuaweiSlotist = baseHuaweiStoreLink + "C100945189";
    String storeLinkHuaweiSpades = baseHuaweiStoreLink + "C107697363";
    String storeLinkHuaweiSportsBetting = baseHuaweiStoreLink + "C107580587";
    String storeLinkHuaweiVideopoker = baseHuaweiStoreLink + "C107057933";

    @Test
    void successUpdateVersionPokerist() {
        open(storeLinkHuaweiPokerist);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionBelote() {
        open(storeLinkHuaweiBelote);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionBlackjackist() {
        open(storeLinkHuaweiBlackjackist);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionCraps() {
        open(storeLinkHuaweiCraps);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionDurak() {
        open(storeLinkHuaweiDurak);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionRoulettist() {
        open(storeLinkHuaweiRoulettist);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionSlotist() {
        open(storeLinkHuaweiSlotist);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionSpades() {
        open(storeLinkHuaweiSpades);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionSportsBetting() {
        open(storeLinkHuaweiSportsBetting);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }

    @Test
    void successUpdateVersionVideopoker() {
        open(storeLinkHuaweiVideopoker);
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text(version));
    }
}