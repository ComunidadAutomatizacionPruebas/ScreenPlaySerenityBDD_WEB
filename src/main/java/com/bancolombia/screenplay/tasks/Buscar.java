package com.bancolombia.screenplay.tasks;

import static com.bancolombia.screenplay.user_interface.WikiHomePage.BOTON_BUSCAR;
import static com.bancolombia.screenplay.user_interface.WikiHomePage.BUSCAR_PALABRA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

public class Buscar implements Task {
    private String palabra;

    public Buscar(String palabra) {
        this.palabra = palabra;
    }

    public static Buscar elTermino(String palabra) {
        return Tasks.instrumented(Buscar.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabra).into(BUSCAR_PALABRA),
                Click.on(BOTON_BUSCAR));
    }



}
