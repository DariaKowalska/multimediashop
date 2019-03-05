package pl.myproject.multimediashop.model;

public abstract class BookBuilder<BookClass extends Book> {
    protected String authorFirstName;
    protected String authorLastName;
    protected String title;

    public BookBuilder authorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
        return this;
    }

    public BookBuilder authorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }
public abstract BookClass build();
    /*public Book build() {
        Book book = new Book();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }*/
}
