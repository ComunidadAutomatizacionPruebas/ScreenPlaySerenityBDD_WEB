package com.bancolombia.screenplay.tasks;

import com.bancolombia.screenplay.user_interface.WikipediaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private WikipediaPage Wikipediapage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(Wikipediapage));
    }

    public static Abrir laUrl() {
        return Tasks.instrumented(Abrir.class);
    }
}
