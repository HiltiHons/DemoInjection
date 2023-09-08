package at.bbrz.demoinjection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Not;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class UnterrichtProgrammierenTest
{
    private UnterrichtProgrammieren unterrichtProgrammieren;

    @Mock
    private AnwesenheitsSerive anwesenheitsSerive;
    @Mock
    private NoteVergeben noteVergeben;

    @BeforeEach
    void setUp()
    {
        Mockito.when(anwesenheitsSerive.anwesendSind(Mockito.anyInt())).thenReturn(List.of("Willi Huber", "Claudia Himmel"));
        unterrichtProgrammieren = new UnterrichtProgrammieren(anwesenheitsSerive);
    }

    @Test
    void anwesnheitsKontrolle()
    {
        unterrichtProgrammieren.anwesenheitsKontrolle(10);
    }
}