package src.test.java;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
public class LoginTests {
    @Test
    void successlogintest() {
        Configuration.holdBrowserOpen = true;
        open("https://qa.guru/cms/system/login");
        $("[name=email]").setValue("pekite4449@chambile.com");
        $("[name=password]").setValue("$&C14D3dd1");
        $(".btn-success").click();
        $(".has-arrow").click();
        $(".logined-form").shouldHave(Condition.text("Account"));
    }
}


