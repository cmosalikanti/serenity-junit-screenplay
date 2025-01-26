package org.example.acceptancetests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.questions.Presence;
import org.example.actions.Inventory;
import org.example.actions.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenTryingToLogin {

    @CastMember
    Actor actor;

    @Test
    void shouldBeAbleToLogin() {
        actor.attemptsTo(
                Login.as("standard_user", "secret_sauce")
        );

        assertThat(actor.asksFor(Presence.of(Inventory.INVENTORY_LIST))).isTrue();
    }

    @Test
    void shouldNotBeAbleToLogin() {
        actor.attemptsTo(
                Login.as("standard_user", "secret_sauc")
        );

        assertThat(actor.asksFor(Presence.of(Login.ERROR_MESSAGE))).isTrue();
    }
}
