package at.bbrz.demoinjection;

import lombok.Builder;
import  lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Ergebnis
{
    private String schuelerName;
    private int note;
}
