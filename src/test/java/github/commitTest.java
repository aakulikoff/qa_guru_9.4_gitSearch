package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class commitTest {

    @Test
    void commitTest(){
        open("https://github.com/");
    }
}
