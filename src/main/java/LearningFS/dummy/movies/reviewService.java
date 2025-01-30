package LearningFS.dummy.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    @Autowired
    private reviewRepo ReviewRepo;

    @Autowired
    private MongoTemplate mongotemplate;

    public review createReview(String reviewBody, String imdbId) {
        review rview = ReviewRepo.insert(new review(reviewBody));

        mongotemplate.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(rview.getId()))
                .first();

        return rview;
    }
}
