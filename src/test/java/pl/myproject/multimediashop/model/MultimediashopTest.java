package pl.myproject.multimediashop.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class MultimediashopTest {

    @Test
    public void shouldAddBookWhenListOfBooksExist(){
        //given
        Multimediashop multimediashop = new Multimediashop();
        multimediashop.setMedia(new LinkedList<Book>());
        Book book = new PaperBookBuilder()
                .title("W pustyni i w puszczy")
                .build();
        //when
        multimediashop.addMedium(book);
        //then
        assertEquals(Arrays.asList(book),multimediashop.getMedia());
    }

    @Test
    public void shouldAddBookWhenListOfBookIsNull(){
        //given
        Multimediashop multimediashop = new Multimediashop();
        Book book = new PaperBookBuilder()
                .title("W pustyni i w puszczy")
                .build();
        //when
        multimediashop.addMedium(book);
        //then
        assertEquals(Arrays.asList(book), multimediashop.getMedia());
    }
}
