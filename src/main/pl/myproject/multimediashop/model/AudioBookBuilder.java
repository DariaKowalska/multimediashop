package pl.myproject.multimediashop.model;

public class AudioBookBuilder {
    private Format format;
    private String authorFirstName;
    private String authorLastName;
    private String title;

    public AudioBookBuilder format(Format format){
        this.format=format;
        return this;
    }


    public AudioBookBuilder authorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
        return this;
    }

    public AudioBookBuilder authorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
        return this;
    }


    public AudioBookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public AudioBook build() {
        AudioBook book = new AudioBook();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        book.setFormat(format);
        return book;
    }

}
