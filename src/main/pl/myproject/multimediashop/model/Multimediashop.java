package pl.myproject.multimediashop.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Multimediashop {

    private List<Book> books;
    public List<Book> getBooks(){
        return Collections.unmodifiableList(books);
    }
    public void setBooks(List<Book> books) {
        this.books=new LinkedList<>(books);
    }
    public void addBook(Book book){
        if (books == null){
            books = new LinkedList<>();
        }
        books.add(book);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimediashop that = (Multimediashop) o;
        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Multimediashop{");
        sb.append("books=").append(books);
        sb.append('}');
        return sb.toString();
    }
}



