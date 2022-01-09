
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SoftAssertionsTest {
    @Test
    void testSelenideHW3 () {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("body").shouldHave(Condition.text("Soft assertions"));
        $(".Layout-main").scrollTo().$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }
}
