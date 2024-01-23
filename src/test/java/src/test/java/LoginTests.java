package src.test.java;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;


public class LoginTests {
    @Test
    void successlogintest() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("intl.accept_languages", "de-DE,de");
        options.setExperimentalOption("prefs", prefs);
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.holdBrowserOpen = true;
        open("https://appgallery.huawei.ru/#/app/C100359849");
        $x("/html/body/div/div[3]/div/div[3]/div[7]/div/div[2]/div[1]/div[3]/div[2]").shouldHave(Condition.text("58.24.0"));
    }
}