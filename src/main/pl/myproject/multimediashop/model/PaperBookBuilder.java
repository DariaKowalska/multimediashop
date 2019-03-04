package pl.myproject.multimediashop.model;

public class PaperBookBuilder extends BookBuilder<PaperBook>{
    private Cover cover;

    public PaperBookBuilder cover (Cover cover){
        this.cover=cover;
        return this;
    }

    @Override
    public BookBuilder authorFirstName(String authorFirstName) {
        super.authorFirstName(authorFirstName);
        return this;
    }

    @Override
    public BookBuilder authorLastName(String authorLastName) {
        super.authorLastName(authorLastName);
        return this;
    }

    @Override
    public BookBuilder title(String title) {
         super.title(title);
         return this;
    }

    @Override
    public PaperBook build() {
        PaperBook paperBook = new PaperBook();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        paperBook.setAuthor(author);
        paperBook.setTitle(title);
        paperBook.setCover(cover);
        return paperBook;
    }
}
