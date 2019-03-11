package pl.myproject.multimediashop.model;

import java.util.Objects;

public class PaperBook extends Book implements PaperMedium {
    PaperBook() {
    }

    private Cover cover;
    private int pageCount;

    public Cover getCover() {

        return cover;
    }

    public void setCover(Cover cover) {

        this.cover = cover;
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void setPageCount(int pageCount) {

        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaperBook paperBook = (PaperBook) o;
        return pageCount == paperBook.pageCount &&
                cover == paperBook.cover;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cover, pageCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaperBook{");
        sb.append("author=").append(author);
        sb.append(", title='").append(title);
        sb.append(", cover=").append(cover);
        sb.append(", pageCount=").append(pageCount).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
