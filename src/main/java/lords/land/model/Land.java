package lords.land.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.sql.Timestamp;

@Getter
@Setter
@MongoEntity(collection="lands")
public class Land {
    ObjectId id;

    String title;

    String attribute;

    Integer status;

    Timestamp createdAt;

    Timestamp updatedAt;
}
