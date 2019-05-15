package com.bancolombia.screenplay.questions;

import static com.bancolombia.screenplay.user_interface.WikiHomePage.RESULTADO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RESULTADO).viewedBy(actor).asString().trim();
    }

    public static ElMensaje enPantalla() {
        return new ElMensaje();
    }
}
