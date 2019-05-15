package com.bancolombia.screenplay.step_definitions;

import com.bancolombia.screenplay.questions.ElMensaje;
import com.bancolombia.screenplay.tasks.Abrir;
import com.bancolombia.screenplay.tasks.Buscar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.*;

public class ConsultaWikipediaStepDefinition {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Dubier realiza una consulta en Wikipedia$")
    public void queDubierRealizaUnaConsultaEnWikipedia() {
        theActorCalled("Dubier").wasAbleTo(Abrir.laUrl());
    }

    @Cuando("^el busca el termino (.*)$")
    public void elBuscaElTerminoBancolombia(String palabra) {
        theActorInTheSpotlight().attemptsTo(Buscar.elTermino(palabra));
    }

    @Entonces("^el visualiza la información del Banco (.*)$")
    public void elVisualizaLaInformaciónDelBancoBancolombia(String resultado) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.enPantalla(), containsString(resultado)));
    }
}
