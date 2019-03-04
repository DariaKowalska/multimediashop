package pl.myproject.multimediashop.model;

public class AudioBookBuilder extends BookBuilder<AudioBook> {
    private Format format;

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
    public AudioBook build() {
        AudioBook audioBook = new AudioBook();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        audioBook.setAuthor(author);
        audioBook.setTitle(title);
        audioBook.setFormat(format);
        return audioBook;
    }

}
