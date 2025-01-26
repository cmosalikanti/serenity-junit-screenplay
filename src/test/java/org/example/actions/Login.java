package org.example.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USERNAME_FIELD = Target.the("the username")
            .located(By.cssSelector("#user-name"));
    public static final Target PASSWORD_FIELD = Target.the("the password")
            .located(By.cssSelector("#password"));
    public static final Target LOGIN_BUTTON = Target.the("the login button")
            .located(By.cssSelector("#login-button"));
    public static final Target ERROR_MESSAGE = Target.the("error message")
            .located(By.cssSelector(".error-message-container"));

    public static Performable as(String username, String password) {
        return Task.where(
                "{0} logs in as " + username,
                NavigateTo.loginPage(),
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );
    }
}
