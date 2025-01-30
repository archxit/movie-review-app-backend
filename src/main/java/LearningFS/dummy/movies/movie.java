package LearningFS.dummy.movies;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class movie 
{
    @Id
    private ObjectId id;
    
    private String imdbId;
    private String title, releaseDate, trailerLink, poster;

    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<review> reviewIds;
}
