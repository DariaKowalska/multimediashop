package pl.myproject.multimediashop.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Multimediashop<T extends Medium> {

    private List<T> media;
    public List<T> getMedia(){
        return Collections.unmodifiableList(media);
    }
    public void setMedia(List<T> media) {
        this.media=new LinkedList<>(media);
    }
    public void addMedium(T medium){
        if (media == null){
            media = new LinkedList<>();
        }
        media.add(medium);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimediashop that = (Multimediashop) o;
        return Objects.equals(media, that.media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(media);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Multimediashop{");
        sb.append("media=").append(media);
        sb.append('}');
        return sb.toString();
    }
}



