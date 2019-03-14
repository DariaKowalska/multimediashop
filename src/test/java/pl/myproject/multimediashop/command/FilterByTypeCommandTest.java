package pl.myproject.multimediashop.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.myproject.multimediashop.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class FilterByTypeCommandTest {

    private InputStream inputStream;

    @Before public void setUp(){
        inputStream = System.in;
    System.setIn(new ByteArrayInputStream("Movie\n".getBytes()));
    }
    @After public void tearDown(){
        System.setIn(inputStream);
    }
    @Test public void shouldDisplayMovieWhenFilterByMovie(){
        //given
        PaperBook book = new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("W pustyni i w puszczy")
                .cover(Cover.SOFT)
                .pageCount(300)
                .build();
        Movie movie1 = new MovieBuilder()
                .title("W pustyni i w puszczy")
                .directorFirstName("Andrzej")
                .directorLastName("Wajda")
                .duration(120)
                .build();
        Movie movie2 = new MovieBuilder()
                .title("Człowiek z marmuru")
                .directorFirstName("Andrzej")
                .directorLastName("Wajda")
                .duration(120)
                .build();
Multimediashop<Medium> multimediashop = new Multimediashop<>();
multimediashop.addMedium(book);
multimediashop.addMedium(movie1);
multimediashop.addMedium(movie2);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new FilterByTypeCommand(multimediashop, printStreamMock );

        //when
command.execute();

        //then
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println(movie1);
        verify(printStreamMock, times(1)).println(movie2);
        verify(printStreamMock, never()).println(book);
    }
}
