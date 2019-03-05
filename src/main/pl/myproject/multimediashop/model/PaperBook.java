package pl.myproject.multimediashop.model;

import java.util.Objects;

public class PaperBook extends Book {
    PaperBook(){
    }
    private Cover cover;

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaperBook paperBook = (PaperBook) o;
        return Objects.equals(cover, paperBook.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cover);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaperBook{");

        sb.append(", author=").append(author);
        sb.append(", title='").append(title).append('\'');
        sb.append("cover=").append(cover);
        sb.append('}');
        return sb.toString();
    }
}
