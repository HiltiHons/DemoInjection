package at.bbrz.demoinjection;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Log
public class UnterrichtProgrammieren
{

    private AnwesenheitsSerive anwesenheitsSerive;
    private NoteVergeben noteVergeben;


    @Autowired
    public UnterrichtProgrammieren(AnwesenheitsSerive anwesenheitsSerive)
    {
        this.anwesenheitsSerive = anwesenheitsSerive;
        this.noteVergeben = noteVergeben;
    }
    private int anzahlAnwesend;
    private List<String> schuelerNamen;

    public void anwesenheitsKontrolle(int schuelerAnzahl)
    {
        log.info("Alle da?");
        schuelerNamen = anwesenheitsSerive.anwesendSind(schuelerAnzahl);
        anzahlAnwesend = schuelerNamen.size();
        log.info("Es sind " +anzahlAnwesend+" Schüler in Programmieren anwesend");
        log.info("Anwesende Schüler: ");
        log.info("-------- -------------------");

        for(String name : schuelerNamen)
        {
            log.info(name);
        }

    }

    public List<Ergebnis> leistungsUeberpruefung()
    {
        List<Ergebnis> ergebnisList = new ArrayList<>();
        for(String name : schuelerNamen)
        {
            ergebnisList.add(noteVergeben.noteVergeben(name));


        }
        for(Ergebnis ergebnis: ergebnisList)
        {
            log.info("Ergebnis Leistungsüberprüfung: " + ergebnis);
        }
        return ergebnisList;
    }
}
