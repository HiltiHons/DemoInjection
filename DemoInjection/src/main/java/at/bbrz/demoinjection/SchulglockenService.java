package at.bbrz.demoinjection;

import org.springframework.stereotype.Component;

@Component
public class SchulglockenService
{
    public void ringPause()
    {
        System.out.println("Ring Ring Ring - Pause");
    }
    public void ringPauseEnde()
    {
        System.out.println("Ring Ring Ring - Pause ENDE");
    }
}
