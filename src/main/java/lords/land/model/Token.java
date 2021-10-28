package lords.land.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.security.Timestamp;

@Getter
@Setter
@MongoEntity(collection="tokens")
public class Token {
    ObjectId id;

    Integer quantity;

    Timestamp updatedDate;

}