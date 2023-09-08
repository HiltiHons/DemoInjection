package at.bbrz.demoinjection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoteVergebenTest
{
    public static final String A_NAME = "a name";
    private NoteVergeben noteVergeben;

    @BeforeEach
    void setUp()
    {
        noteVergeben = new NoteVergeben();
    }

    @Test
    void schuelerNameInErgebnis()
    {
        Ergebnis ergebnis = noteVergeben.noteVergeben(A_NAME);

        assertEquals(A_NAME, ergebnis.getSchuelerName());
    }

    @Test
    void noteShouldBetweenOneAndFive()
    {
        for (int i = 0; i < 100; i++)
        {
            Ergebnis ergebnis = noteVergeben.noteVergeben(A_NAME);
            assertTrue(ergebnis.getNote()>=1 && ergebnis.getNote()<=5);
        }
    }

    @Test
    void throwIllegalArgumentExceptionWhenNameIsNull()
    {
        assertThrows(IllegalArgumentException.class, () ->
        {
            noteVergeben.noteVergeben(null);
        });
    }
    @Test
    void throwIllegalArgumentExceptionIsEmpty()
    {
        assertThrows(IllegalArgumentException.class, () ->
        {
            noteVergeben.noteVergeben("");
            noteVergeben.noteVergeben(" ");
        });
    }
}
