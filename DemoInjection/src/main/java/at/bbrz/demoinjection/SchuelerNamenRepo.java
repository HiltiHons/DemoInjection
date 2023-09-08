package at.bbrz.demoinjection;

import java.util.List;
public interface SchuelerNamenRepo
{
    List<String> schuelerNamen(String klasse, int anzahl);
}
