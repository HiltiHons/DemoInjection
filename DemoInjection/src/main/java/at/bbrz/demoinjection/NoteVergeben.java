package at.bbrz.demoinjection;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class NoteVergeben
{

    public Ergebnis noteVergeben(String schuelerName)
    {
        if(schuelerName == null)
        {
            throw new IllegalArgumentException("Name can't be null");
        }
        if(schuelerName.trim().isEmpty())
        {
            throw new IllegalArgumentException("Name can't be empty");
        }
        Random random = new Random();
        int note = random.nextInt(5) + 1;
        return Ergebnis.builder()
                .schuelerName(schuelerName)
                .note(note)
                .build();
    }
}
