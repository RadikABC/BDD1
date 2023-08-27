package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.Data;
import ru.netology.page.VerificationPage;

import static com.codeborne.selenide.Selenide.$;
import static java.awt.SystemColor.info;

public class LoginPage {
    private final SelenideElement loginField = $("[data-test-id=login] input");

    private final SelenideElement passwordField = $("[data-test-id=password] input");

    private final SelenideElement loginButton = $("[data-test-id=action-login]");

    public VerificationPage validLogin(Data.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}
