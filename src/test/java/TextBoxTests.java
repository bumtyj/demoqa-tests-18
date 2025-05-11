import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("[id=userName]").setValue("Sam");
        $("[id=userEmail]").setValue("Sam@gmail.com");
        $("[id=currentAddress]").setValue("Samadress1");
        $("[id=permanentAddress]").setValue("Samadresspemanent");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Sam"),text("Sam@gmail.com"),
                 text("Samadress1"),text("Samadresspemanent"));
    }
}
