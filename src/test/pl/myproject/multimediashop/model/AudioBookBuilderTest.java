package pl.myproject.multimediashop.model;

import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AudioBookBuilderTest {

    @Test
    private void shouldBuildAudioBookWhenAudioBookDetailsAreDefined(){
        //given
        String authorFirstName = "Henryk";
        String authorLastName = "Sienkiewicz";
        String title = " W pustyni i w puszczy";
        Format format = Format.MP3;
        int duration = 1000;
        //when
        AudioBook book = new AudioBookBuilder()
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .title(title)
                .format(format)
                .duration(duration)
                .build();
        //then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
        assertEquals(format, book.getFormat());
        assertEquals(duration, book.getDuration());
    }
}
