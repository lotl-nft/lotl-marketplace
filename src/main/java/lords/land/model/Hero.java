package lords.land.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.sql.Timestamp;

@Getter
@Setter
@MongoEntity(collection="heroes")
public class Hero {
    ObjectId id;

    String title;

    Integer attribute;

    Integer status;

    Timestamp createdAt;

    Timestamp updatedAt;
}
