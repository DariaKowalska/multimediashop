package pl.myproject.multimediashop.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaperBookBuilderTest {

    @Test
    public void shouldBuildPaperBookWhenPaperBookDetailsAreDefined(){
        //given
        String authorFirstName = "Henryk";
        String authorLastName = "Sienkiewicz";
        String title = " W pustyni i w puszczy";
        Cover cover = Cover.HARD;
        int pageCount = 230;

        //when
        PaperBook book = new PaperBookBuilder()
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .title(title)
                .cover(cover)
                .pageCount(pageCount)
                .build();
        //then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
        assertEquals(cover, book.getCover());
        assertEquals(pageCount, book.getPageCount());

    }

}
