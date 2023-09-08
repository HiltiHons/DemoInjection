package at.bbrz.demoinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
@Service
public class AnwesenheitsSerive
{
    @Autowired
    private SchuelerNamenRepo repo;
    public List<String> anwesendSind(int maxSchueler)
    {
        Random random = new Random();
        int anzahl = random.nextInt(maxSchueler);
        return repo.schuelerNamen("1B", anzahl);
    }
}
