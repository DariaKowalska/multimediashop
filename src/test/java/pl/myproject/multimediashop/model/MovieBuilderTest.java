package pl.myproject.multimediashop.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieBuilderTest {

    @Test
    public void shouldBuildMovieWhenAllDateIsDefined(){
        //given
        String title = "W pustyni i w puszczy";
        String directorFirstName="Gavin";
        String directorLastName="Hood";
        int duration = 120;
        //when
        Movie movie = new MovieBuilder()
                .title(title)
                .directorFirstName(directorFirstName)
                .directorLastName(directorLastName)
                .duration(duration)
                .build();

        //then
        assertNotNull (movie);
        assertEquals(title,movie.getTitle());
        assertNotNull(movie.getDirector());
        assertEquals(directorFirstName, movie.getDirector().getFirstName());
        assertEquals(directorLastName, movie.getDirector().getLastName());
        assertEquals(duration, movie.getDuration());

    }
}
