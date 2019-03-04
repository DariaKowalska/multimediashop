package pl.myproject.multimediashop.model;

public class PaperBookBuilder {
    private Cover cover;
    private String authorFirstName;
    private String authorLastName;
    private String title;

    public PaperBookBuilder cover (Cover cover){
        this.cover=cover;
        return this;
    }


    public PaperBookBuilder authorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
        return this;
    }

    public PaperBookBuilder authorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
        return this;
    }


    public PaperBookBuilder title(String title) {
         this.title = title;
         return this;
    }

    public PaperBook build() {
        PaperBook book = new PaperBook();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        book.setCover(cover);
        return book;
    }
}
