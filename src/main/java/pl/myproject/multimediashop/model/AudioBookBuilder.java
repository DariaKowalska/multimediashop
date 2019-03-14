package pl.myproject.multimediashop.model;

import java.util.Optional;

public class AudioBookBuilder {
    private Format format;
    private String authorFirstName;
    private String authorLastName;
    private String title;
    private int duration;

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

    public AudioBookBuilder duration (int duration) {
        this.duration=duration;
        return this;
    }

     public AudioBook build() {
        AudioBook book = new AudioBook();
        Creator author = new Creator();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        book.setFormat(format);
        book.setFormat(Optional
        .ofNullable(format)
        .orElse(Format.MP3));
        /*if (format !=null){
            book.setFormat(format);
        }else{
            book.setFormat(Format.MP3);
        }*/
        book.setDuration(duration);
        return book;
    }


}
