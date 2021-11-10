package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class gitHubTests {

    @Test
    void gitHubSelenideSearch() {
        open("https://github.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $(".repo-list").shouldHave(text("selenide/selenide"));
        $(byLinkText("selenide/selenide")).click();
        $("#wiki-tab").click();
        $(byText("Wiki")).click();
        $(byText("Soft assertions"))
                .shouldBe(Condition.visible)
                .click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }


    @Test
    void dragAndDrop() {

    }
}
