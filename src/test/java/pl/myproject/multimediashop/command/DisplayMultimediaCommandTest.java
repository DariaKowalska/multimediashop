package pl.myproject.multimediashop.command;

import org.junit.Test;
import pl.myproject.multimediashop.*;
import pl.myproject.multimediashop.model.*;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static sun.misc.PerformanceLogger.times;

public class DisplayMultimediaCommandTest {
    @Test
    public void shouldDisplayMultimediaWhenSomeMultimediaIsAvailable() {
        //given
        PaperBook book = new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("W pustyni i w puszczy")
                .cover(Cover.SOFT)
                .pageCount(300)
                .build();
        Movie movie = new MovieBuilder()
                .title("W pustyni i w puszczy")
                .directorFirstName("Andrzej")
                .directorLastName("Wajda")
                .duration(120)
                .build();
        Multimediashop<Medium> multimediashop = new Multimediashop<>();
        multimediashop.addMedium(book);
        multimediashop.addMedium(movie);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new DisplayMultimediaCommand(multimediashop, printStreamMock);

        //when
        command.execute();

        //then
        verify(printStreamMock, times(1)).println(book);
        verify(printStreamMock, times(1)).println(movie);
    }
}
