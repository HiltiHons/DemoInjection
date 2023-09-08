package at.bbrz.demoinjection;

import  org.springframework.stereotype.Component;

import java.util.ArrayList;
import  java.util.List;
import java.util.Random;

@Component
public class RandomSchuelernamenRepo implements SchuelerNamenRepo
{
    private List<String> vornamen = List.of("Max", "Sandra", "Phillip", "Andreas", "Rene", "Michael", "Stefan", "Herbert", "Wolfgang", "Daniel", "Michi");
            private List<String> nachnamen = List.of("Huber", "Hasenhütl", "Feßler", "Nußdorfer", "Emirham", "Fasching", "Nebenführ", "Brieger", "Hütter", "Leitner", "Reiner");
    @Override
    public List<String> schuelerNamen(String klasse, int anzahl)
    {
        List<String> namen = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < anzahl; i++)
        {
            String name = vornamen.get(random.nextInt(vornamen.size()))+ " " + nachnamen.get(random.nextInt(nachnamen.size()));
            namen.add(name);
        }
        return namen;
    }
}

