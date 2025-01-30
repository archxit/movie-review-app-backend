package LearningFS.dummy.movies;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin("*")
public class reviewController {
    @Autowired
    private reviewService rviewService;

    @PostMapping()
    public ResponseEntity<review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<review>(rviewService.createReview(
                payload.get("reviewBody"), payload.get("imdbId")),
                HttpStatus.CREATED);
    }
}