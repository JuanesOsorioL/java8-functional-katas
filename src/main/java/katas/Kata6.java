package katas;

import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream().flatMap(video->video.getBoxarts().stream())
                .reduce((a,b)->a.getWidth() * a.getHeight() > b.getWidth() * b.getHeight() ? a : b ).get().getUrl();
    }
}
