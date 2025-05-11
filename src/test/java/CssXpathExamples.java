




import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;


public class CssXpathExamples {
    private String XPathExpression;

    void cssXpathExamples(){

        $("[data-testid=email]").setValue("1");
        $("[id=email]").setValue("1").setValue("1");
        $$x(XPathExpression)
        $("[class=login_form_input_box]").setValue("1");

        // <div>Hello qa.guru!<div>
        $x(XPathExpression;:"//div[text()='Hello qa.guru!']").click();
        $(byText("Hello qa.guru!")).click();


    }



}
