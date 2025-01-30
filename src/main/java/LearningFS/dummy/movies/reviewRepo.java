package LearningFS.dummy.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepo extends MongoRepository<review, ObjectId>
{
    
}
