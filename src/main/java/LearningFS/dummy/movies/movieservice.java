package LearningFS.dummy.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class movieservice
{
    @Autowired
    private movierepo movierepository;
    
    public List<movie> allMovies()
    {
        return movierepository.findAll();
    }

    public Optional<movie> singlemovie(String imdbId)
    {
        return movierepository.findMovieByImdbId(imdbId);
    }
}
