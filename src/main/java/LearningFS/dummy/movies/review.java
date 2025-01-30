package LearningFS.dummy.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor @NoArgsConstructor
public class review
{
    private ObjectId id;
    private String body;

    public review(String body)
    {
        this.body = body;
    }
}
