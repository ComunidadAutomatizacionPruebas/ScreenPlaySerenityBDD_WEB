package com.bancolombia.screenplay.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WikiHomePage {
    public static final Target BUSCAR_PALABRA= Target.the("Texto a buscar")
            .located(By.name("search"));
    public static final Target BOTON_BUSCAR= Target.the("Botón buscar")
            .located(By.name("go"));
    public static final Target RESULTADO= Target.the("Resultado de la consulta")
            .located(By.id("firstHeading"));


}
