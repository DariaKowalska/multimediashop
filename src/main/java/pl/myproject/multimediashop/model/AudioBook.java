package pl.myproject.multimediashop.model;

import java.util.Objects;

public class AudioBook extends Book implements DigitalMedium{

    public AudioBook() {
    }

    private Format format;
    private int duration;

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudioBook audioBook = (AudioBook) o;
        return duration == audioBook.duration &&
                format == audioBook.format;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), format, duration);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioBook{");

        sb.append(", author=").append(author);
        sb.append(", title='").append(title);
        sb.append("format=").append(format);
        sb.append(", duration=").append(duration).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
