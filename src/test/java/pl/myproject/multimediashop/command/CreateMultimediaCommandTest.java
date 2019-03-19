package pl.myproject.multimediashop.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.myproject.multimediashop.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CreateMultimediaCommandTest {
    private static final String TEST_AUDIO_BOOK_INPUT = "AudioBook \nW pustyni i w puszczy \nHenryk \nSienkiewicz \nMP3 \n100\n";

    private InputStream inputStream;

    @Before public void setUp(){
        inputStream = System.in;
        System.setIn(new ByteArrayInputStream((TEST_AUDIO_BOOK_INPUT.getBytes())));
    }

    @After public void tearDown(){
        System.setIn(inputStream);
    }

    @Test
    public void shouldCreateAudioBookWhenAudioBookTypeWasTyped(){
       //given
        Multimediashop<Medium> multimediashop = new Multimediashop<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(multimediashop, printStreamMock);

       //when
        command.execute();
        // then
        AudioBook audioBook = new AudioBookBuilder()
                .title("W pustyni i w puszczy")
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .format(Format.MP3)
                .duration(100)
                .build();
        Multimediashop<Medium> expectedMultimediashop = new Multimediashop<>();
        expectedMultimediashop.addMedium(audioBook);
        assertEquals(expectedMultimediashop, multimediashop);
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println("Tytuł:");
        verify(printStreamMock, times(1)).println("Imię autora:");
        verify(printStreamMock, times(1)).println("Nazwisko autora:");
        verify(printStreamMock, times(1)).println("Format:");
        verify(printStreamMock, times(1)).println("Czas trwania:");
    }

}
