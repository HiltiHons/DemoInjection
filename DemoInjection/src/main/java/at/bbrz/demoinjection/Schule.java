package at.bbrz.demoinjection;

import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Schule
{
    @Autowired
    private SchulglockenService schulglockenService;

    @Autowired
    private UnterrichtProgrammieren unterrichtProgrammieren;

    public void starteSchule()
    {
        schulglockenService.ringPause();
        schulglockenService.ringPauseEnde();
        unterrichtProgrammieren.anwesenheitsKontrolle(20);
        unterrichtProgrammieren.leistungsUeberpruefung();

    }
}
