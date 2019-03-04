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
        multimediashop.setBooks(new LinkedList<Book>());
        Book book = new Book();
        book.setTitle("W pustyni i w puszczy");
        //when
        multimediashop.addBook(book);
        //then
        assertEquals(Arrays.asList(book),multimediashop.getBooks());
    }

    @Test
    public void shouldAddBookWhenListOfBookIsNull(){
        //given
        Multimediashop multimediashop = new Multimediashop();
        Book book = new Book();
        //when
        multimediashop.addBook(book);
        //then
        assertEquals(Arrays.asList(book), multimediashop.getBooks());
    }
}
